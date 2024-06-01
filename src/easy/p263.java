package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/31 上午1:12
 * @Author: 邻座旅客
 */
public class p263 {

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        }
        int[] arr = {2, 3, 5};
        for (int i : arr) {
            while (n % i == 0) {
                n /= i;
            }
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int n = 14;
//        int n = 6;
        int n = 25;
        System.out.println(isUgly(n));
    }
}

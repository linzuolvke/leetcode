package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/6/8 上午12:13
 * @Author: 邻座旅客
 */
public class p326 {

    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        double d = n;
        while (d > 1) {
            d = d / 3;
            if (d == 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(6));
        System.out.println(isPowerOfThree(9));
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(34));
        System.out.println(isPowerOfThree(45));
    }
}

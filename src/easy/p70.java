package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/9 2:41 上午
 * @Author: 邻座旅客
 */
public class p70 {
    public static int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] arr = new int[46];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(8));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(31));
        System.out.println(climbStairs(13));
//        int i = 2, j= 5;
//        i = j ^ i;
//        j = i ^ j;
//        i = j ^ i;
//        System.out.println(i);
//        System.out.println(j);
    }
}
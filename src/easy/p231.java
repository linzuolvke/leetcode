package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/29 上午7:45
 * @Author: 邻座旅客
 */
public class p231 {

    public static boolean isPowerOfTwo(int n) {
        return n >> Integer.numberOfTrailingZeros(n) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(256));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
    }
}

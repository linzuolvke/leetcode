package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/9 2:25 上午
 * @Author: 邻座旅客
 */
public class p69 {

    public static int mySqrt(int x) {
        long result = 0;
        while (result * result < x) {
            result += 1;
        }
        if (result * result > x) {
            result -= 1;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(mySqrt(2147483647));
        System.out.println(System.currentTimeMillis() - start);
    }
}


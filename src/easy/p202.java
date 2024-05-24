package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/24 4:14 下午
 * @Author: 邻座旅客
 */
public class p202 {

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = getNext(n);
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isHappy(19));
        System.out.println(isHappy(7));
//        System.out.println(isHappy(2));
    }
}

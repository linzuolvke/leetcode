package easy;

import java.util.Random;

/**
 * @Description:
 * @Created by
 * @Date 2024/6/5 上午11:45
 * @Author: 邻座旅客
 */
public class p278 {

    // 实际错误版本号
    static int bad;

    // 如果是错误版本号及以上，返回true
    public static boolean isBadVersion(int num) {
        return num >= bad;
    }

    // 使用二分法查找错误版本号
    public static int firstBadVersion(int n) {
        int min = 1;
        int max = n;
        int test = min + (max - min) / 2;;
        int count = 0;
        while (min < max) {
            if (isBadVersion(test)) {
                max = test;
            } else {
                min = test + 1;
            }
            count++;
            test = min + (max - min) / 2;
        }
        System.out.println("循环了 " + count + " 次");
        return test;
    }

    public static void main(String[] args) {
        // 假设有1w个版本号
        int n = 1;
        Random rdm = new Random();
        bad = rdm.nextInt(n) + 1;
//        bad = 1;
        System.out.println("当前共有 " + n + " 个版本号");
        System.out.println("实际错误版本号是：" + bad);
        int version = firstBadVersion(n);
        System.out.println("得到错误版本号是：" + version);
    }
}

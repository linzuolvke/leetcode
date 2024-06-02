package easy;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/31 上午1:18
 * @Author: 邻座旅客
 */
public class p268 {

    public static int missingNumber(int[] nums) {
        int sum = (1 + nums.length) * nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[1];
        System.out.println(missingNumber(nums));
    }
}

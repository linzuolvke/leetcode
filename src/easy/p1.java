package easy;

import java.util.Arrays;

/**
 * @Description:
 * @Created by
 * @Date 2024/4/28 8:39 下午
 * @Author: 邻座旅客
 */
public class p1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}

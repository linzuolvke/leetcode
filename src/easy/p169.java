package easy;

import java.util.Arrays;

/**
 * @Description:
 *
 * @Created by
 * @Date 2024/5/17 10:04 上午
 * @Author: 邻座旅客
 */
public class p169 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

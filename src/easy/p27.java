package easy;

import java.util.Arrays;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/19 2:13 下午
 * @Author: 邻座旅客
 */
public class p27 {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]) {
                nums[i] = Integer.MAX_VALUE;
            } else {
                k++;
            }
        }
        Arrays.sort(nums);
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}

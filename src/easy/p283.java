package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/6/5 上午11:39
 * @Author: 邻座旅客
 */
public class p283 {

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        int[] nums = {0,1,3,0,5,12};
        moveZeroes(nums);
    }
}

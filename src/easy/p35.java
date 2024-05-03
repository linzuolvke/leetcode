package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/4 1:16 上午
 * @Author: 邻座旅客
 */
public class p35 {

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                index = i + 1;
            } else {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
//        int target = 5;
        int target = 2;
//        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}

package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/27 11:57 下午
 * @Author: 邻座旅客
 */
public class p219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(nums[i]);
            if (index != null) {
                int abs = Math.abs(i - index);
                if (abs <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
//        int k = 3;

//        int[] nums = {1, 0, 1, 1};
//        int k = 1;

        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));

    }

}

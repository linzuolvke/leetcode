package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/27 12:48 上午
 * @Author: 邻座旅客
 */
public class p217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }

}

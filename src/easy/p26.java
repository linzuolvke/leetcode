package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/2 3:56 下午
 * @Author: 邻座旅客
 */
public class p26 {

    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int num : nums) {
            linkedHashSet.add(num);
        }
        Integer[] array = linkedHashSet.toArray(new Integer[linkedHashSet.size()]);
        for (int i = 0; i < array.length; i++) {
            nums[i] = array[i];
        }
        return array.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};

        int[] nums = {1,1,2};
        int[] expectedNums = {1,2}; // 长度正确的期望答案

//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] expectedNums = {0,1,2,3,4}; // 长度正确的期望答案

        int k = removeDuplicates(nums); // 调用

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}

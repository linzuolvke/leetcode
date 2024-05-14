package easy;

import java.util.Arrays;

/**
 * @Description:
 * 作者：力扣官方题解
 *         链接：https://leetcode.cn/problems/merge-sorted-array/solutions/666608/he-bing-liang-ge-you-xu-shu-zu-by-leetco-rrb0/
 *         来源：力扣（LeetCode）
 *         著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date 2024/5/15 4:56 下午
 * @Author: 邻座旅客
 */
public class p88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; ++i) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }
}

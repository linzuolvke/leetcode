package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/14 9:25 下午
 * @Author: 邻座旅客
 */
public class p136 {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
//        int[] arr = {4,1,2,1,2};
//        int[] arr = {1};
        System.out.println(singleNumber(arr));
    }
}

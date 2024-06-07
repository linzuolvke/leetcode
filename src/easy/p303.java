package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/6/6 上午9:22
 * @Author: 邻座旅客
 */
public class p303 {

    public static int[] defaultNums;

    public p303(int[] nums) {
        this.defaultNums = nums;
    }

    public static int sumRange(int left, int right) {
        if (left < 0 || right >= defaultNums.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += defaultNums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        p303 numArray = new p303(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0, 2));
        System.out.println(numArray.sumRange(2, 5));
        System.out.println(numArray.sumRange(0, 5));
    }


}

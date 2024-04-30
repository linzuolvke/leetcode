package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/4/30 10:57 下午
 * @Author: 邻座旅客
 */
public class p2798 {

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int i = 0;
        for (int hour : hours) {
            if (hour >= target) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

    }
}

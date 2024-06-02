package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/31 上午12:58
 * @Author: 邻座旅客
 */
public class p258 {
    public static int addDigits(int num) {
        while (num > 9) {
            char[] arr = String.valueOf(num).toCharArray();
            num = 0;
            for (int i = 0; i < arr.length; i++) {
                num += Character.getNumericValue(arr[i]);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}

package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/6 1:56 上午
 * @Author: 邻座旅客
 */
public class p66 {

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (digits[i] == 9) {
                    result = new int[digits.length + 1];
                    result[i] = 1;
                    break;
                }
                result[i] = digits[i] + 1;
                break;
            } else {
                if (digits[i] == 9) {
                    continue;
                }
                digits[i] += 1;
                for (int j = i + 1; j < digits.length; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {0};
        int[] arr3 = {9, 9, 9, 9};
        int[] arr4 = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        System.out.println(plusOne(arr1));
        System.out.println(plusOne(arr2));
        System.out.println(plusOne(arr3));
        System.out.println(plusOne(arr4));
    }
}

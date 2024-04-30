package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/4/29 3:33 下午
 * @Author: 邻座旅客
 */
public class p9 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return reverseString(str).equals(String.valueOf(x));
    }

    public static String reverseString(String str) {
//        System.out.println(str.substring(1));
//        System.out.println("str.substring(1)======" + str.substring(1));
//        System.out.println("str.charAt(0)======" + str.charAt(0));
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(-111));
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(12321));
    }
}

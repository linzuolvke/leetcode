package easy;

import java.util.Locale;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/13 10:30 上午
 * @Author: 邻座旅客
 */
public class p125 {
    public static boolean isPalindrome(String s) {
        char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        if (chars.length < 2) {
            return true;
        }
        for (int i = 0; i <= chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
//        String s = "";
        System.out.println(isPalindrome(s));
//        System.out.println( 99 / 2);
    }


}

package easy;

import java.util.Arrays;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/31 上午12:07
 * @Author: 邻座旅客
 */
public class p242 {

    public static boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        String string1 = new String(chars);
        String string2 = new String(chart);
        return string1.equals(string2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}

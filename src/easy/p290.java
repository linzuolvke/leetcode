package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Created by
 * @Date 2024/6/6 上午6:25
 * @Author: 邻座旅客
 */
public class p290 {

    public static boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        char[] charArray = pattern.toCharArray();
        if (strings.length != charArray.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            String temp = map.get(charArray[i]);
            if (temp == null) {
                if (map.containsValue(strings[i])) {
                    return false;
                }
                map.put(charArray[i], strings[i]);
            } else {
                if (!temp.equals(strings[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
//        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }
}

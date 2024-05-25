package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/26 2:23 上午
 * @Author: 邻座旅客
 */
public class p205 {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.get(c1) == null || map.get(c1).equals("")) {
                if (map.containsValue(c2)) {
                    return false;
                }
                map.put(c1, c2);
            } else {
                if (map.get(c1) != c2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "egg";
//        String t = "add";
//        String s = "foo";
//        String t = "bar";
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }
}

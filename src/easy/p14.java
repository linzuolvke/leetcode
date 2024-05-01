package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/1 3:39 上午
 * @Author: 邻座旅客
 */
public class p14 {

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    return result;
                }
            }
            result = prefix;
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "111";
        String str2 = "";
//        System.out.println(str1.charAt(0));
//        System.out.println(str1.startsWith("111"));
        System.out.println(str1.substring(0, 3));

//        System.out.println(str1.startsWith(0));
//        System.out.println(str2.charAt(0));

//        String strs[] = {"flower","flow","flight"};
        String strs[] = {"doggggggg","doggggggg","dog"};
        System.out.println(longestCommonPrefix(strs));

    }
}

package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/5 2:41 上午
 * @Author: 邻座旅客
 */
public class p58 {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (!s.contains(" ")) {
            return s.length();
        }
        return s.length() - s.lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        String str1 = "";
        String str2 = "Hello World";
        String str3 = "   fly me   to   the moon  ";
        String str4 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(str1));
        System.out.println(lengthOfLastWord(str2));
        System.out.println(lengthOfLastWord(str3));
        System.out.println(lengthOfLastWord(str4));
    }
}

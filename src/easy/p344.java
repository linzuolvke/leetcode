package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/6/9 下午10:20
 * @Author: 邻座旅客
 */
public class p344 {

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            s[i] = (char) ((int) s[i] ^ (int) s[s.length - 1 - i]);
            s[s.length - 1 - i] = (char) ((int) s[i] ^ (int) s[s.length - 1 - i]);
            s[i] = (char) ((int) s[i] ^ (int) s[s.length - 1 - i]);
        }
        System.out.println(s);
    }


    public static void main(String[] args) {
        String s = "Hello world";
        char[] charArray = s.toCharArray();
        reverseString(charArray);
    }

}

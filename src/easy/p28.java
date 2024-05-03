package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/3 11:35 下午
 * @Author: 邻座旅客
 */
public class p28 {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}

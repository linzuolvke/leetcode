package easy;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/1 10:46 下午
 * @Author: 邻座旅客
 */
public class p20 {

    public static void main(String[] args) {
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "][";
        String str5 = "{[]}";
        String str6 = "(){}}{";
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
        System.out.println(isValid(str5));
        System.out.println(isValid(str6));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1 || Brackets.isExist(s.charAt(0)) == null) {
            return false;
        }
        char[] chars = s.toCharArray();
        Brackets exist = null;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            exist = Brackets.isExist(chars[i]);
            // 如果是右括号
            if (exist == null) {
                if (!stack.isEmpty()) {
                    Integer pop = stack.pop();
                    if (Brackets.getByCode(pop).right != chars[i]) {
                        return false;
                    }
                    continue;
                }
                return false;
            } else {
                stack.push(exist.code);
            }
        }
        return stack.isEmpty();
        // 按照leetcode给的3个示例去做，结果出现了第4个示例 s="{[]}" 导致没过
//        for (int i = 0; i < chars.length; i++) {
//            if (i % 2 == 0) {
//                exist = Brackets.isExist(chars[i]);
//                if (exist == null) {
//                    return false;
//                }
//            } else {
//                if (chars[i] != exist.right) {
//                    return false;
//                }
//            }
//        }
    }

    enum Brackets {
        BRACKETS_A(1, '(', ')'),
        BRACKETS_B(2, '[', ']'),
        BRACKETS_C(3, '{', '}');

        int code;
        char left;
        char right;

        Brackets(int code, char left, char right) {
            this.code = code;
            this.left = left;
            this.right = right;
        }

        static Brackets getByCode(Integer code) {
            for (Brackets option : Brackets.values()) {
                if (option.code == (code)) {
                    return option;
                }
            }
            return null;
        }

        static Brackets isExist(char c) {
            for (Brackets option : Brackets.values()) {
                if (option.left == (c)) {
                    return option;
                }
            }
            return null;
        }
    }
}

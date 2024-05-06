package easy;

/**
 * @Description: 看了题解
 * 作者：画手大鹏
 *         链接：https://leetcode.cn/problems/add-binary/solutions/9617/hua-jie-suan-fa-67-er-jin-zhi-qiu-he-by-guanpengch/
 *         来源：力扣（LeetCode）
 *         著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date 2024/5/7 2:10 上午
 * @Author: 邻座旅客
 */
public class p67 {

    public static String addBinary(String a, String b) {
        // 测试用例：10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101
        // 无法满足
//        int aInt = Integer.parseInt(a, 2);
//        int bInt = Integer.parseInt(b, 2);
//        return Integer.toBinaryString(aInt + bInt);
        StringBuilder ans = new StringBuilder();
        int ca = 0;
        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            ca = sum / 2;
        }
        ans.append(ca == 1 ? ca : "");
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1011";
        String b = "1111";
        System.out.println(addBinary(a, b));
    }
}

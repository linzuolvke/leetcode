package easy;


/**
 * @Description: 虽然想过递归来解决该问题，但官方的解题思路真是太优雅了，膜拜
 * 作者：力扣官方题解
 *         链接：https://leetcode.cn/problems/merge-two-sorted-lists/solutions/226408/he-bing-liang-ge-you-xu-lian-biao-by-leetcode-solu/
 *         来源：力扣（LeetCode）
 *         著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date 2024/5/2 2:54 下午
 * @Author: 邻座旅客
 */
public class p21 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }


    public static void main(String[] args) {
//        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1, new ListNode(2));
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(mergeTwoLists(list1, list2));
        /**
         * 124、134
         *  124、34
         *   23、34
         *    3、34
         *     3、4
         *      null、4
         *
         */
    }
}

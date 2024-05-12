package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/10 8:16 上午
 * @Author: 邻座旅客
 */
public class p83 {
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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head != null && head.next != null) {
            head.next = deleteDuplicates(head.next);
            if (head.val == head.next.val) {
                head = head.next;
            }
        }

//        1.3.3.3.4
//        3.3.3.4
//        3.3.4
//        3.4
//        4
        return head;
    }


    public static void main(String[] args) {
//        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(4)))));
        ListNode list2 = new ListNode();
        ListNode x = deleteDuplicates(list2);
        System.out.println(x);
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

package easy;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/24 8:28 下午
 * @Author: 邻座旅客
 */
public class p203 {

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

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))));
        list1 = removeElements(list1, 1);
        System.out.println(list1);
    }
}

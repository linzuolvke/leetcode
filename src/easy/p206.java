package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/24 8:28 下午
 * @Author: 邻座旅客
 */
public class p206 {

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

    public static ListNode reverseList(ListNode head) {
        ListNode resultList = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = resultList;
            resultList = curr;
            curr = next;
        }
        return resultList;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))));
        list1 = reverseList(list1);
        System.out.println(list1);
    }
}

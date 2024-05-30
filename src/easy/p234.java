package easy;

import java.util.Objects;

/**
 * @Description:
 * @Created by
 * @Date 2024/5/30 上午12:12
 * @Author: 邻座旅客
 */
public class p234 {

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

    // 深拷贝链表
    public static ListNode deepCopy(ListNode head) {
        ListNode dummy = new ListNode(0); // 新链表的虚拟头结点
        ListNode prev = dummy; // 新链表的前一个节点

        ListNode curr = head; // 当前节点
        while (curr != null) {
            // 创建当前节点的深拷贝
            ListNode newNode = new ListNode(curr.val);
            prev.next = newNode; // 将新节点连接到新链表中
            prev = newNode; // 更新prev指针
            curr = curr.next; // 移动到下一个节点
        }

        return dummy.next; // 返回新链表的头结点
    }

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ListNode listNode = new ListNode(head.val);
        ListNode temp = deepCopy(head);
        while (temp.next != null) {
            listNode = new ListNode(temp.next.val, listNode);
            temp = temp.next;
        }
        while (head.next != null) {
            if (head.val != listNode.val) {
                return false;
            }
            head = head.next;
            listNode = listNode.next;
        }
        return true;
    }

    public static void main(String[] args) {
        
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode listNode2 = new ListNode(1, new ListNode(1));
        System.out.println(isPalindrome(listNode));
        System.out.println(isPalindrome(listNode2));

    }
}

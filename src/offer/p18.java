package offer;

import java.util.List;

import DataStructure.ListNode;

public class p18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head;
        ListNode cur = head.next;
        if (pre.val == val) {
            return head.next;
        }
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(9);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(5, node3);
        ListNode root = new ListNode(4, node2);

        ListNode res = new p18().deleteNode(root, 1);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}
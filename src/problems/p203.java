package problems;

import DataStructure.ListNode;

public class p203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode prev = res;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l7 = new ListNode(6, null);
        ListNode l6 = new ListNode(5, l7);
        ListNode l5 = new ListNode(4, l6);
        ListNode l4 = new ListNode(3, l5);
        ListNode l3 = new ListNode(6, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode listNode = new p203().removeElements(l1, 6);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

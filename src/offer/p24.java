package offer;

import DataStructure.ListNode;

public class p24 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null, next = curr.next;
        while (next != null) {

            curr.next = prev;
            prev = curr;
            curr = next;

            next = next.next;

        }
        curr.next = prev;
        return curr;
    }

    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode listNode = new p24().reverseList(l1);
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
    }
}
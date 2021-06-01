package offer;

import DataStructure.ListNode;

public class p22 {
    int count = 0;
    ListNode res;

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        getKthFromEnd(head.next, k);
        count++;
        if (count == k) {
            res = head;

        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(new p22().getKthFromEnd(node1, 1).val);
        System.out.println(new p22().getKthFromEnd(node1, 2).val);
        System.out.println(new p22().getKthFromEnd(node1, 3).val);
        System.out.println(new p22().getKthFromEnd(node1, 4).val);
    }

}
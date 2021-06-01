package problems;

import DataStructure.ListNode;

public class p141 {
    //快慢指针解题。
    public boolean hasCycle(ListNode head) {


        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;


    }


    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(-4);
        ListNode listNode3 = new ListNode(0, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(3, listNode2);

        listNode4.next = listNode2;

        System.out.println(new p141().hasCycle(listNode1));

    }
}

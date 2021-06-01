package problems;

import DataStructure.ListNode;

public class p147 {

    public ListNode insertionSortList(ListNode head) {

        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0, head);

        ListNode lastSorted = head;
        ListNode cur = lastSorted.next;

        while (cur != null) {
            if (lastSorted.val <= cur.val) {
                lastSorted = lastSorted.next;
            } else {
                ListNode prev = dummyHead;
                while (prev.next.val <= cur.val) {
                    prev = prev.next;
                }
                lastSorted.next = cur.next;
                cur.next = prev.next;
                prev.next = cur;
            }

            cur = lastSorted.next;
        }

        return dummyHead.next;

    }

    public static void main(String[] args) {

        // [4,2,1,3]
        // ListNode node3 = new ListNode(3);
        // ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, null);
        ListNode root = new ListNode(1, node1);

        ListNode res = new p147().insertionSortList(root);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

}
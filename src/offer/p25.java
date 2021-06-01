package offer;

import DataStructure.ListNode;

public class p25 {
    // 迭代法
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // if(l1==null&&l2==null){return l1;}
    // ListNode res = new ListNode();
    // ListNode cur = res;
    // res.next = cur;
    // while (l1 != null && l2 != null) {
    // if (l1.val > l2.val) {
    // cur.next = l2;
    // l2 = l2.next;
    // } else {
    // cur.next = l1;
    // l1 = l1.next;
    // }
    // cur = cur.next;
    // }
    // if (l1 != null) {
    // cur.next = l1;
    // }
    // if (l2 != null) {
    // cur.next = l2;
    // }

    // return res.next;
    // }
    // 递归法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        // 1->2->4, 1->3->4
        ListNode listNode = new p25().mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4, null))),
                new ListNode(1, new ListNode(3, new ListNode(4, null))));
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
    }
}
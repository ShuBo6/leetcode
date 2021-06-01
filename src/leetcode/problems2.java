package leetcode;

import DataStructure.ListNode;

public class problems2 {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currL1 = 0, currL2 = 0;
        ListNode res = new ListNode();
        ListNode headNode = null;
        int temp = 0;
        while (l1 != null && l2 != null) {
            headNode=res;
            currL1 = l1.val;
            currL2 = l2.val;
            res.next=new ListNode((currL1 + currL2) % 10 + temp);
            temp = (currL1 + currL2) /10;
            res=res.next;
            l1=l1.next;
            l2=l2.next;

        }
        while (l1 != null || l2 != null){
            res=res.next;
            if (l1!=null){
                res.next=new ListNode(l1.val + temp);
            }
            if (l2!=null){
                res.next=new ListNode(l2.val + temp);
            }

            temp=(currL1 + currL2) /10;
        }
        return headNode;
    }

    public static void main(String[] args) {
        ListNode listNode7 = new ListNode(9, null);
        ListNode listNode6 = new ListNode(9, listNode7);
        ListNode listNode5 = new ListNode(9, listNode6);
        ListNode listNode4 = new ListNode(9, listNode5);
        ListNode listNode3 = new ListNode(9, listNode4);
        ListNode listNode2 = new ListNode(9, listNode3);
        ListNode listNode1 = new ListNode(9, listNode2);


        ListNode l4 = new ListNode(9, null);
        ListNode l3 = new ListNode(9, l4);
        ListNode l2 = new ListNode(9, l3);
        ListNode l1 = new ListNode(9, l2);

        ListNode res = addTwoNumbers(listNode1, l1);
        while (res.next != null) {
            System.out.println(res.val);
        }
//        System.out.printf(""+(false||false));

    }
}

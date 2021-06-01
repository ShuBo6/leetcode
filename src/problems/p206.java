package problems;

import DataStructure.ListNode;

public class p206 {
//    给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。

    // public ListNode reverseList(ListNode head) {
    //     ListNode cur= head;
    //     ListNode prev=null,Next;
    //     while (cur!=null){
    //         Next=cur.next;
    //         cur.next=prev;
    //         prev=cur;
    //         cur=Next;

    //     }
    //     return prev;
    // }
// 递归法
//         public ListNode reverseList(ListNode head){
//             if(head.next==null || head==null) return head;
//             ListNode temp=reverseList(head.next);
//             head.next.next=head;
//             head.next=null;
//             return temp;

//         }
        
//    public static void main(String[] args) {
//
////        ListNode l7 = new ListNode(7, null);
////        ListNode l6 = new ListNode(6, l7);
//        ListNode l5 = new ListNode(5, null);
//        ListNode l4 = new ListNode(4, l5);
//        ListNode l3 = new ListNode(3, l4);
//        ListNode l2 = new ListNode(2, l3);
//        ListNode l1 = new ListNode(1, l2);
//
//        ListNode listNode = new p206().reverseList(l1);
//        while (listNode != null) {
//            System.out.print(listNode.val+"->");
//            listNode = listNode.next;
//        }
//    }


}

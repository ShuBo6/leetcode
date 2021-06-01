package offer;

import DataStructure.ListNode;

public class p52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode    node1 =headA;   
        ListNode    node2 =headB;   
        while(node2!=node1){
            node1= node1!=null ? node1.next:headA;
            node2=node2!=null ? node2.next:headB;
        }
        return node1;
    }
}
package problems;

import DataStructure.ListNode;

public class p2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        int jw=0;
        int curAdd=0;
        ListNode head=result;
        while(l1!=null&&l2!=null){
            curAdd=l1.val+l2.val + jw;
            result.next=new ListNode(curAdd%10);
            jw=curAdd/10;
            l1=l1.next;
            l2=l2.next;
            result=result.next;
        }
        while (l1!=null){
            curAdd=l1.val+ jw;
            result.next=new ListNode(curAdd%10 );
            jw=curAdd/10;
            l1=l1.next;
            result=result.next;
        }

        while (l2!=null){
            curAdd=l2.val+ jw;
            result.next=new ListNode(curAdd%10 );
            jw=curAdd/10;
            l2=l2.next;
            result=result.next;
        }

        if (jw!=0){
            result.next=new ListNode(jw );
        }




        return head.next;

    }

    public static void main(String[] args) {
        ListNode l7=new ListNode(9,null);
        ListNode l6=new ListNode(9,l7);
        ListNode l5=new ListNode(9,l6);
        ListNode l4=new ListNode(9,l5);
        ListNode l3=new ListNode(9,l4);
        ListNode l2=new ListNode(9,l3);
        ListNode l1=new ListNode(9,l2);



        ListNode ll4=new ListNode(9,null);
        ListNode ll3=new ListNode(9,ll4);
        ListNode ll2=new ListNode(9,ll3);
        ListNode ll1=new ListNode(9,ll2);
        ListNode listNode = addTwoNumbers(l1, ll1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }
}

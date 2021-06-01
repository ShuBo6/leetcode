package offer;

import java.util.LinkedList;
import java.util.*;

import DataStructure.ListNode;

public class p06 {
    // 递归法
    // int length;
    // int[] res;

    // public int[] reversePrint(ListNode head) {
    //     recursion(head, 0);
    //     return res;
    // }

    // public void recursion(ListNode head, int count) {
    //     if (head == null) {
    //         res = new int[length];
    //         return;
    //     }
    //     ++length;
    //     recursion(head.next, count+1);
    //     res[length - count-1] = head.val;
    // }
    public int[] reversePrint(ListNode head) {
        int ListNodeSize=0;
        ListNode temp=head;
        while(temp!=null){
            ListNodeSize++;
            temp=temp.next;
        }
        int[] res=new int[ListNodeSize];
        for (int i = ListNodeSize-1; i >=0; i--) {
            res[i]=head.val;
            head=head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(2);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(1, node2);
        for (int x : new p06().reversePrint(node1)) {

            System.out.println(x);
        }

    }
}
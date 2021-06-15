package SwordOfferReview;

import DataStructure.ListNode;

import java.util.*;

public class p6 {
    public int[] reversePrint(ListNode head) {
        ListNode prev = null, next = head.next;
        while (next != null) {
            head.next = prev;
            prev = head;
            head = next;
            next = head.next;

        }
        head.next=prev;
        List<Integer> res=new ArrayList<>();

        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
    }

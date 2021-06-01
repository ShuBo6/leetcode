package offer;

import java.util.HashSet;
import java.util.PriorityQueue;

public class p49 {
    public int nthUglyNumber(int n) {
        if (n==1){return 1;}
        int[] nums={2,3,4,5};
        HashSet<Long> set=new HashSet<>();
        PriorityQueue<Long> minHeap=new PriorityQueue<>();
        set.add(1L);
        minHeap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long curr=minHeap.poll();
            ugly=(int) curr;
            for (int x:nums                ) {
                long    next=curr*x;
                if (set.add(next)){
                    minHeap.offer(next);
                }
            }

        }
        return ugly;

    }
}

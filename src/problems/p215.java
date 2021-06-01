package problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class p215 {
    public int findKthLargest(int[] nums, int k) {
        int res = 0;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : nums) {
            maxheap.add(x);
        }

        while (--k>0){
            maxheap.poll();
        }


        res=maxheap.peek();
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};

        System.out.printf("第k个最大数"+new p215().findKthLargest(nums,2));
    }
}

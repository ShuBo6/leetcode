package offer;

import java.util.Arrays;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Stack;

public class p40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res=new int[k];
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int x:arr             ) {
            heap.add(x);
        }
        for (int i = 0; i < k; i++) {
            res[i]=heap.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new p40().getLeastNumbers(new int[]{4,5,1,6,2,7,3,8}, 4)));
        System.out.println(Arrays.toString(new p40().getLeastNumbers(new int[]{0, 1, 2, 1}, 1)));
    }

}

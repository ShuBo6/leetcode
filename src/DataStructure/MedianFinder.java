package DataStructure;

import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> MinHeap;
    PriorityQueue<Integer> MaxHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        MinHeap=new PriorityQueue<>();
        MaxHeap=new PriorityQueue<>(((o1, o2) -> o2-o1));
    }

    public void addNum(int num) {//保证最大最小堆的堆顶永远都是中间值
        if ((MinHeap.size()+MaxHeap.size())%2==0){
            MaxHeap.add(num);
            MinHeap.add(MaxHeap.poll());
        }else {
            MinHeap.add(num);
            MaxHeap.add(MinHeap.poll());
        }
    }

    public double findMedian() {
        if ((MinHeap.size()+MaxHeap.size())%2==0){
            return (MinHeap.peek()+MaxHeap.peek())/2.0;
        }else {
            return MinHeap.peek();
        }
    }
}
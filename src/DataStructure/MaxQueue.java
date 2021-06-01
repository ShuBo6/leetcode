package DataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxQueue {
    Deque<Integer> d ;
    Queue<Integer> q;
    public MaxQueue() {
        d=new LinkedList<>();
        q=new LinkedList<>();
    }

    public int max_value() {
        if (d.isEmpty()){
            return -1;
        }else {
            return d.peek();
        }

    }

    public void push_back(int value) {
        while (!d.isEmpty() && d.peekLast() < value) {
            d.pollLast();
        }
        d.offerLast(value);
        q.offer(value);
    }

    public int pop_front() {
        if (q.isEmpty()){
            return -1;
        }
        int ans = q.poll();
        if (ans == d.peekFirst()) {
            d.pollFirst();
        }
        return ans;

    }
}
//[null,-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,646,null,646,646,646,null,123,871,null,871,871,871,646,null,null,null,null,229,871,285,285,45,140,null,null,140,null,null,null,null,837,806,null,806,806,545,806,806,806,null,561,null,237,806,806,806,null,633,null,null,null,98,866,806,866,866,866,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,720,null,674,null,null,770]
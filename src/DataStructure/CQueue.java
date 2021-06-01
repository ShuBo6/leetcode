package DataStructure;

import java.util.*;

public class CQueue {
    Deque<Integer> stackUp;
    Deque<Integer> stackDown;

    public CQueue() {

        stackUp = new LinkedList<>();
        stackDown = new LinkedList<>();
    }

    public void appendTail(int value) {

        stackUp.push(value);

    }

    public int deleteHead() {

        int res = -1;

        while (!stackUp.isEmpty()) {
            stackDown.push(stackUp.pop());
        }
        if (!stackDown.isEmpty()) {
            res = stackDown.pop();
        }

        return res;
    }
}
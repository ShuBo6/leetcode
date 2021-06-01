package offer;

import DataStructure.CQueue;

public class p09 {
public static void main(String[] args) {
    CQueue test=new CQueue();
    test.appendTail(3);
    System.out.println(test.deleteHead());
    System.out.println(test.deleteHead());
}
}
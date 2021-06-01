package offer;

import java.util.Stack;

public class p31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack =new Stack<>();
        int index=0;
        for (int x:pushed             ) {
            stack.push(x);
            while (!stack.isEmpty()&&stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
//        int[] popped={2,4,5,3,1};
        int[] popped={4,5,3,2,1};
        int[] popped1={4,3,5,1,2};
        System.out.println( new p31().validateStackSequences(pushed,popped) );
        System.out.println( new p31().validateStackSequences(pushed,popped1) );


        int[] pushed1={2,1,0};
        int[] popped2={1,2,0};
        System.out.println( new p31().validateStackSequences(pushed1,popped2) );
        System.out.println( new p31().validateStackSequences(new int[]{1,0,2},new int[]{2,1,0} ));

    }
}

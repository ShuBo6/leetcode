package problems;

import java.util.Arrays;

public class p27 {
    public int removeElement(int[] nums, int val) {
        int curr = 0;
        for (int x : nums) {
            if (x != val) {
                nums[curr++] = x;
            }

        }
        return curr;
    }

    public static void main(String[] args) {
        int[] a={0,1,2,2,3,0,4,2};
        int len=new p27().removeElement(a,2);
        System.out.println(Arrays.toString(a));
    }
}

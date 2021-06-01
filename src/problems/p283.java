package problems;

import java.util.Arrays;

public class p283 {

    public void moveZeroes(int[] nums) {
        int curr = 0;
        int index = 0;
        for (int x :
                nums) {
            if (x != 0) {
                nums[curr++] = x;
            }

        }
        while (curr < nums.length) {
            nums[curr++] = 0;
        }
    }


    public static void main(String[] args) {
//        int[] a={0,1,0,3,12};
        int[] a = {0, 1, 0};
//        int[] a = {0, 0, 1};
        new p283().moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}

package offer;

import java.util.Arrays;

public class p21 {

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left<right) {

            while (nums[left] % 2 == 1 && left != right) {
                    left++;

                System.out.println(left);
            }
            while (nums[right] % 2 == 0 && left != right) {
                    right--;

                System.out.println(right);
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 8, 3, 2 };
        System.out.println(Arrays.toString(new p21().exchange(nums)));
    }

}

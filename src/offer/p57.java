package offer;

import java.util.*;

public class p57 {
    // public int[] twoSum(int[] nums, int target) {
    // Map<Integer,Integer> map=new HashMap<>();

    // for (int i : nums) {
    // map.put(target-i, i);
    // }
    // int a=0,b=0;
    // for (int i : nums) {
    // if(map.containsKey(i)){
    // a=map.get(i);
    // b=i;
    // }
    // }
    // return new int[]{a,b};
    // }
    // 双指针解法

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int a = 0, b = 0;
        while (left < right) {
            int temp = nums[left] + nums[right];
            if (target == temp) {
                a = nums[left];
                b = nums[right];
                break;
            } else if (target < temp) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] { a, b };
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(new p57().twoSum(new int[] { 2, 7, 11, 15
        // }, 9)));
        System.out.println(Arrays.toString(new p57().twoSum(new int[] { 16, 16, 18, 24, 30, 32 }, 48)));
    }
}
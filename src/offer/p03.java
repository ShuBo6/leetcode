package offer;

import java.util.*;

public class p03 {

    // 1.桶标记 空间复杂度O(n) 时间复杂度O(n)
    // public int findRepeatNumber(int[] nums) {
    // int res = -1;
    // int[] arr = new int[nums.length];
    // for (int i = 0; i < arr.length; i++) {
    // arr[nums[i]]++;
    // if (arr[nums[i]] > 1) {
    // res = nums[i];
    // }
    // }
    // return res;
    // }

    // 2.哈希集合 空间复杂度O(n) 时间复杂度O(n)
    // public int findRepeatNumber(int[] nums) {
    // int res=-1;
    // Set<Integer> hashSet=new HashSet<>();
    // for (int i = 0; i < nums.length; i++) {

    // if(hashSet.contains(nums[i])){
    // res = nums[i];
    // }
    // hashSet.add(nums[i]);
    // }

    // return res;
    // }
    // 3.排序看前后元素是否相等 时间复杂度O(nlogn) 空间O(1)
    // public int findRepeatNumber(int[] nums) {
    //     Arrays.sort(nums);
    //     int res = -1;
    //     for (int i = 0; i < nums.length - 1; i++) {
    //         if (nums[i + 1] == nums[i]) {
    //             res = nums[i];
    //         }
    //     }
    //     return res;
    // }
    // 4.二分法
//    public int findRepeatNumber(int[] nums) {
//
//    }

}
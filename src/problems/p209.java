package problems;

public class p209 {
    //
//209. 长度最小的子数组
//    给定一个含有 n 个正整数的数组和一个正整数 target 。
//
//    找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
//
//
//
//    示例 1：
//
//    输入：target = 7, nums = [2,3,1,2,4,3]
//    输出：2
//    解释：子数组 [4,3] 是该条件下的长度最小的子数组。
//    示例 2：
//
//    输入：target = 4, nums = [1,4,4]
//    输出：1
//    示例 3：
//
//    输入：target = 11, nums = [1,1,1,1,1,1,1,1]
//    输出：0
//
//
//    提示：
//
//            1 <= target <= 109
//            1 <= nums.length <= 105
//            1 <= nums[i] <= 105
//
//
//    进阶：
//
//    如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。
    public int minSubArrayLen(int target, int[] nums) {
        int resLen = 0;
        int windowIndex = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while (sum>=target){
                resLen=resLen==0?i-windowIndex+1:Math.min(resLen,i-windowIndex+1);
                sum-=nums[windowIndex++];
            }
        }
        return resLen;
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int[] num1 = {1, 4, 4};
        int[] num2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] num3 = {1, 2, 3, 4, 5};

        System.out.println(new p209().minSubArrayLen(7, nums));
        System.out.println(new p209().minSubArrayLen(4, num1));
        System.out.println(new p209().minSubArrayLen(11, num2));
        System.out.println(new p209().minSubArrayLen(11, num3));
    }


}

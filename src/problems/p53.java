package problems;

public class p53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)//sum大于零，视为当前最大子序列是一个正数。往后累加一定能取到最大子序列和的情况。
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
    // public int maxSubArray(int[] nums) {
    //     return maxSub(0, nums.length-1, nums);
    // }
    // public int maxSub(int left,int right,int[] nums){
    //     if(left==right) return nums[left];

    //     int mid=right / 2;
        
    //     int leftRes=maxSub(left, mid, nums);
    //     int rightRes = maxSub(mid+1,right, nums);

    //     int temp=leftRes+rightRes;

    //     int res=Math.max(leftRes,Math.max(rightRes,temp));
    //     return res;

    // }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new p53().maxSubArray(nums));
        
    }
}
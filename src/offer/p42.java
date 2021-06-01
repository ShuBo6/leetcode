package offer;

public class p42 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for (int x:nums             ) {
            if (sum>=0){
                sum+=x;
            }else {
                sum=x;
            }
            max=Math.max(sum,max);
        }
        return  max;

    }

    public static void main(String[] args) {
        System.out.println(new p42().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}
        ));
    }
}

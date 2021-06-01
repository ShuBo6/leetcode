package offer;

public class p53_2 {
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        
        while(left<=right){int m=left+(right-left)/2;
            if(nums[m]==m){
                left=m+1;
            }
            else{
                right=m-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        System.out.println(new p53_2().missingNumber(new int[]{0,1,2,3,4,5,6,7,9}));
        System.out.println(new p53_2().missingNumber(new int[]{0,1,3,4,5,6,7,8,9}));
        System.out.println(new p53_2().missingNumber(new int[]{0,1,2,3,4,6,7}));
    }
}
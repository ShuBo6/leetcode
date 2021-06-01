package problems;

import java.util.Arrays;

public class p169 {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int count=0;
        // System.out.println(Arrays.toString(nums));
        int res=nums[0];
        
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                count++;
            }
            else{count=0;}
            if((count+1)>nums.length/2){
                res=nums[i];
            }
            // System.out.println(i+":"+(count+1));
        }


        return res;
    }
    public static void main(String[] args) {
        int[] nums={3,2,3};
        
        System.out.println(new p169().majorityElement(nums));


        int[] nums1={3,1,4,6,7,8,8,4,7,3,2,3,4,5,5,5,10,55,5,5,5,5,5,6,5,5,5,5,5,5};
        
        System.out.println(new p169().majorityElement(nums1));
    }
}
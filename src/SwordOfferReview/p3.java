package SwordOfferReview;


import java.util.HashSet;
import java.util.Set;

public class p3 {
    public int findRepeatNumber(int[] nums) {
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]!=i){
                if (nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new p3().findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
        System.out.println(new p3().findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}

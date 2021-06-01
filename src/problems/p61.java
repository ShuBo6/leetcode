package problems;

import java.util.Arrays;

public class p61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                count++;
            }else if (nums[i]==nums[i+1]){
                count=-1;
                break;
            }
            else if (nums[i] + 1 != nums[i + 1]) {
                count -= (nums[i + 1] - nums[i] - 1);
            }
            if (count < 0) {
                break;
            }
        }
        return count >= 0;
    }

    public static void main(String[] args) {
        System.out.println(new p61().isStraight(new int[]{10, 11, 12, 0, 0}));
        System.out.println(new p61().isStraight(new int[]{0,0,2,2,5}));
    }
}

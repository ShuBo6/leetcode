package offer;

public class p53_1 {
    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) i = m + 1;
            else j = m - 1;
        }
        return i;
    }


    public static void main(String[] args) {
        System.out.println(new p53_1().search(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
        System.out.println(new p53_1().search(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
        System.out.println(new p53_1().search(new int[] { 2, 2 }, 2));
        System.out.println(new p53_1().search(new int[] { 1, 4 }, 4));
    }
}
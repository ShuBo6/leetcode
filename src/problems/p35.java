package problems;

public class p35 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int pivot = -1;
        int res=len;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] >= target) {
                res=pivot;
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(new p35().searchInsert(nums,5));
        System.out.println(new p35().searchInsert(nums,2));
        System.out.println(new p35().searchInsert(nums,7));
        System.out.println(new p35().searchInsert(nums,0));

    }
}

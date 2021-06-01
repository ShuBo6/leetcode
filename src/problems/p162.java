package problems;

public class p162 {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int pivot = -1;
        int res=len;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] >= nums[pivot+1]) {
                res=pivot;
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return res;
    }

}

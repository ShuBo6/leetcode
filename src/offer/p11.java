package offer;

public class p11 {
    // public int minArray(int[] numbers) {

    // for (int i = 0; i < numbers.length - 1; i++) {
    // if (numbers[i + 1] < numbers[i]) {
    // return numbers[i + 1];
    // }
    // }
    // return numbers[0];
    // }
    // 递归法
    // int min;

    // public int minArray(int[] numbers) {

    // min = numbers[0];
    // help(0, numbers.length - 1, numbers);
    // return min;
    // }

    // public void help(int left, int right, int[] numbers) {
    // int len = right - left + 1;
    // if (len == 1) {
    // return;
    // }
    // if (len == 2) {
    // min = Math.min(numbers[left], numbers[right]);
    // return;
    // }

    // int mid = left + (right - left) / 2;
    // if (numbers[mid] < numbers[right]) {
    // help(left, mid, numbers);
    // } else if (numbers[mid] > numbers[right]) {
    // help(mid , right, numbers);
    // } else {
    // help(left, right - 1, numbers);
    // }

    // }
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left+1 < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid;
            } else {
                right--;
            }
        }
        return  Math.min(numbers[left], numbers[right]);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        int[] nums2 = { 1, 3, 5 };
        int[] nums1 = { 3, 1, 3 };
        System.out.println(new p11().minArray(nums));
        System.out.println(new p11().minArray(nums2));
        System.out.println(new p11().minArray(nums1));
    }
}
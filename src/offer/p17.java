package offer;

public class p17 {
    public int[] printNumbers(int n) {
        int maxNum = 0;
        while (n > 0) {
            maxNum += 9 * Math.pow(10, n - 1);
            n--;
        }
        int[] nums = new int[maxNum];
        while (maxNum-- > 0) {
            nums[maxNum] = maxNum + 1;
        }

        return nums;

    }

    public static void main(String[] args) {
        for (int x : new p17().printNumbers(2)) {
            System.out.print(x + " ");
        }
        for (int x : new p17().printNumbers(1)) {
            System.out.print(x + " ");
        }
    }
}
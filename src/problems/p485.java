package problems;

public class p485 {
//    给定一个二进制数组， 计算其中最大连续 1 的个数。
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count=0;
            }else {
                ++count;
            }

            max=Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] a={1,1,0,1};
        int[] a={1,1,0,1,1,1};
        System.out.println(new p485().findMaxConsecutiveOnes(a));
    }
}

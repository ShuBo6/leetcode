package problems;
//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
//
//         
//
//        示例 1：
//
//        输入：nums1 = [1,3], nums2 = [2]
//        输出：2.00000
//        解释：合并数组 = [1,2,3] ，中位数 2
//        示例 2：
//
//        输入：nums1 = [1,2], nums2 = [3,4]
//        输出：2.50000
//        解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
//        示例 3：
//
//        输入：nums1 = [0,0], nums2 = [0,0]
//        输出：0.00000
//        示例 4：
//
//        输入：nums1 = [], nums2 = [1]
//        输出：1.00000
//        示例 5：
//
//        输入：nums1 = [2], nums2 = []
//        输出：2.00000
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class p4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int[] megar = merge(nums1, nums2);

        return midNum(megar);
    }
    public static int[] merge(int[] nums1, int[] nums2){
        int i=0;
        int j=0;
        int k=0;

        int[] res=new int[nums1.length+nums2.length];
        while (i<nums1.length&&j<nums2.length){

            res[k++]= nums1[i]<nums2[j] ?nums1[i++]:nums2[j++];

        }
        while (i<nums1.length){
            res[k++]=nums1[i++];
        }
        while (j<nums2.length){
            res[k++]=nums2[j++];
        }
        return res;
    }

    private static double midNum(int[] array) {
        double mid=0;
        if (array.length%2==0){
            mid= (array[array.length/2]+array[array.length/2 -1] )/2.0;
        }else
        {
            mid=array[array.length/2];
        }


        return mid;
    }


    public static void main(String[] args) {
        int[] a1={1,3};
        int[] a2={2,7};
        System.out.println(        new p4().findMedianSortedArrays(a1,a2));

    }

}

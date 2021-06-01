package offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class p39 {
//    哈希表计数
//    public int majorityElement(int[] nums) {
//        int res=nums[0];
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int x:nums             ) {
//            int count=map.getOrDefault(x,0)+1;
//            map.put(x,count);
//            if (count> nums.length/2){
//                res=x;
//            }
//        }
//        return res;
//    }

//    排序取中位数
//public int majorityElement(int[] nums) {
//    Arrays.sort(nums);
//    return nums[nums.length/2];
//}
//    摩尔投票法
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int votes=0;
        int curElement = 0;
        for (int x:nums             ) {
            if (votes==0){curElement=x;}
            if (curElement==x){
                votes++;
            }else {votes--;}
        }
        return curElement;
    }



    public static void main(String[] args) {
        System.out.println(new p39().majorityElement(new int[] {1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(new p39().majorityElement(new int[] {1, 2, 3, 2, 2, 2, 5, 4, 2}));
        System.out.println(new p39().majorityElement(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}

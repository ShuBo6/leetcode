package problems;

import java.util.HashMap;

public class p1 {
    public int[] twoSum(int[] nums, int target) {

        int[] res=new int[2];
        HashMap<Integer,Integer> hashMap=new HashMap();
        for(int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){
                res[0]=i;
                res[1]=hashMap.get(nums[i]);
            }
            hashMap.put(target-nums[i],i);
        }
        return res;

    }
}

package problems;

import java.util.ArrayList;
import java.util.List;


public class p78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subset(res, 0, nums, new ArrayList<>());
        return res;
    }

    public void subset(List<List<Integer>> res, int subsetLen, int[] nums, List<Integer> curSet) {
        if (subsetLen == nums.length) {
            res.add(new ArrayList<>(curSet));
            return;
        }
        subset(res, subsetLen + 1, nums, curSet);
        curSet.add(nums[subsetLen]);
        subset(res ,subsetLen + 1, nums,curSet);
        curSet.remove(curSet.size() - 1);

    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        
        System.out.println(new p78().subsets(nums));

    }
}
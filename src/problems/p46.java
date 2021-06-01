package problems;

import java.util.ArrayList;
import java.util.List;

public class p46 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtracking(res, new ArrayList<>(), nums, visited);

        return res;
    }

    public void backtracking(List<List<Integer>> res, List<Integer> curList, int[] nums, int[] visited) {
        if (curList.size() == nums.length) {
            res.add(new ArrayList<>(curList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (visited[i] == 1)
                    continue;
                curList.add(nums[i]);
                visited[i] = 1;
                backtracking(res, curList, nums, visited);
                curList.remove(curList.size() - 1);
                visited[i] = 0;
            }

        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };

        System.out.println(new p46().permute(nums));
        // System.out.println(new p46().getCombinationLen(3));
        // System.out.println(new p46().getCombinationLen(2));
        // System.out.println(new p46().getCombinationLen(1));

    }
}
package offer;

import java.util.*;

public class p57_2 {
    public int[][] findContinuousSequence(int target) {
        int mid = target % 2 == 0 ? target / 2 : (target + 1) / 2;
        int sum = 0;
        int right = mid;
        int left =0;
        int prev = 1;
        List<int[]> resList = new ArrayList<>();
        while (left <= right) {
            if (sum < target) {
                sum += ++left;
            } else if (sum > target) {
                sum -= prev;
                prev++;
            } else if (sum == target) {
                sum = left;
                int[] temp = new int[left - prev + 1];
                for (int i = 0, l = prev; i < left - prev+1; i++) {
                    temp[i] = l + i;
                }
                resList.add(temp);
                prev = left;
            }
        }
        int[][] res = new int[resList.size()][];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new p57_2().findContinuousSequence(9).toString());
    }
}
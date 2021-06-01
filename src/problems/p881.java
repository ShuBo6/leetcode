package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class p881 {
//    第i个人的体重为people[i]，每艘船可以承载的最大重量为limit。
//
//    每艘船最多可同时载两人，但条件是这些人的重量之和最多为limit。
//
//    返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
//
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while (i<=j){
            int temp =people[i]+people[j];
            if (temp>limit){
                j--;
                count++;
            }
            if (temp<=limit){
                j--;
                i++;
                count++;
            }
            if (j==i){
                count++;
                return count;
            }
        }
//        for (int i = 0; i < people.length; i++) {
//            if (people[i]==limit){
//                count++;
//            }
//            if (people[i]<limit){
//                int last= people.length-1;
//                while (last--!=i){
//                    if ((people[i]+people[last])<=limit){
//                        count++;
//                    }
//                }
//            }
//        }

        return count;
    }

    public static void main(String[] args) {
        int[] p={3,5,3,4};
        int[] p1={3,2,2,1};
        System.out.println(new p881().numRescueBoats(p1,3)) ;
    }
}

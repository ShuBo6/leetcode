package leetcode;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Thread.sleep;

public class problems {
    //    public static int[] twoSum(int[] nums, int target) {
//        int[] res=new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for(int j=i+1;j<nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    res[0]=i;
//                    res[1]=j;
//                }
//            }
//        }
//        return res;
//    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> maps = new HashMap();
        for (int i = 0; i < nums.length; i++) {
//            如果 hashMap 中是否存在指定的 key 对应的映射关系返回 true，否则返回 false。
            if (maps.containsKey(nums[i])) {//循环的第一次，hash表为空，肯定不存在则不执行。
                res[0] = i;
                res[1] = maps.get(nums[i]);
            }
            maps.put(target - nums[i], i);//将

        }

        return res;
    }


    public static void main(String[] args) throws InterruptedException {
        int[] test = new int[]{3, 2, 4};
        System.out.println(Arrays.toString(twoSum(test, 6)));
        HashMap<String, Long> message_timestamp = new HashMap<>();
        message_timestamp.put("topic1", System.currentTimeMillis());
        System.out.println(message_timestamp.get("topic1") / 1000);
        sleep(1000);
        message_timestamp.put("topic1", System.currentTimeMillis());
        System.out.println(message_timestamp.get("topic1") / 1000);
        sleep(1000);
        message_timestamp.put("topic1", System.currentTimeMillis());
        message_timestamp.put("topic1", System.currentTimeMillis());
        System.out.println(message_timestamp.get("topic1") / 1000);
        sleep(1000);
        message_timestamp.put("topic1", System.currentTimeMillis());
        System.out.println(message_timestamp.get("topic1") / 1000);

    }
}

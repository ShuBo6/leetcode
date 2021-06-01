package offer;

import java.util.ArrayList;
import java.util.List;

public class p45 {
    public String minNumber(int[] nums) {
        List<String> stringList=new ArrayList<>();
        for (int x:nums             ) {
            stringList.add(String.valueOf(x));
        }
        stringList.sort((o1,o2)->(o1+o2).compareTo(o2+o1));
        return String.join("",stringList);

    }

    public static void main(String[] args) {
        System.out.println(new p45().minNumber(new  int[]{3,30,34,5,9}));
    }
}

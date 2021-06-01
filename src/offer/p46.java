package offer;

import java.util.ArrayList;
import java.util.List;

public class p46 {
    String str;
    public int translateNum(int num) {
        str=String.valueOf(num);

        return count(0,str.length());
    }
    int count(int start,int end){
        if (end-start<=1){
            return 1;
        }
        int count=0;
        count=count+count(start+1,end);
        if (Integer.parseInt(str.substring(start,start+2))<=25 && str.charAt(start)!='0'){
            count=count+count(start+2,end);
        }
        return count;
    }

}

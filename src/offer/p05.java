package offer;

import java.util.Arrays;

public class p05 {

    public String replaceSpace(String s) {
        char[] res = new char[s.length() * 3];
        int i = 0,j = 0;
        for (; i < s.length(); i++,j++) {
            if (s.charAt(i) == ' ') {
                res[j] = '%';
                res[++j] = '2';
                res[++j] = '0';
            } else {
                res[j] = s.charAt(i);
            }

        }
        String str = new String(res,0,j);
        return str;
    }

    public static void main(String[] args) {

        System.out.println(new p05().replaceSpace("hello world"));
    }

}
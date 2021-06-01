package problems;

import java.util.Arrays;
import java.util.HashSet;

public class p3 {
    //    3. 无重复字符的最长子串
    public int lengthOfLongestSubstring(String s) {

        int rk=0;
        HashSet<Character> CharacterSet=new HashSet<>();
        char[] chars=s.toCharArray();
        int maxSize=0;
        for (int i = 0; i < chars.length; i++) {
            if (i!=0){
                CharacterSet.remove(chars[i-1]);
            }

            while (rk<chars.length&&!CharacterSet.contains(chars[rk])){

                CharacterSet.add(chars[rk]);
                rk++;
            }
            if (CharacterSet.size()>maxSize){
                maxSize=CharacterSet.size();
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        System.out.println(new  p3().lengthOfLongestSubstring("pwwkew"));
    }
}

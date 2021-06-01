package offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class p48 {
//    public int lengthOfLongestSubstring(String s) {
//        HashSet<Character> hashSet=new HashSet<>();
//        int left=0;
//        int max=0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            while (hashSet.contains(c)){
//                hashSet.remove(s.charAt(left++));
//            }
//            hashSet.add(c);
//            max=Math.max(hashSet.size(),max);
//        }
//        return max;
//    }

        public int lengthOfLongestSubstring(String s) {
            Map<Character,Integer> map=new HashMap<>();
            int max=0;
            int temp=0;
            for (int j = 0,i=0; j < s.length(); j++) {
                char c=s.charAt(j);
                i=map.getOrDefault(c,-1);
                map.put(c,j);
                temp=temp<j-i?temp+1:j-i;
                max=Math.max(max,temp);
            }
            return max;
        }

    public static void main(String[] args) {
        System.out.println(new p48().lengthOfLongestSubstring("aaaab"));
        System.out.println(new p48().lengthOfLongestSubstring("abcabcabc"));
        System.out.println(new p48().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new p48().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new p48().lengthOfLongestSubstring("dvdf"));
        System.out.println(new p48().lengthOfLongestSubstring("anviaj"));
        System.out.println(new p48().lengthOfLongestSubstring("aabaab!bb"));

    }

}

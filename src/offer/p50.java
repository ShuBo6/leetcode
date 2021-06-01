package offer;

import java.util.*;

public class p50 {
    public char firstUniqChar(String s) {
        Map<Character, Integer> hashmap = new HashMap<>();

        char res = ' ';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashmap.get(c) == 1) {
                res = c;
                break;
            }

        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println("1:" + new p50().firstUniqChar("abaccdeff"));
        System.out.println("2:" + new p50().firstUniqChar(""));
        System.out.println("3:" + new p50().firstUniqChar("aabbcc"));
    }
}
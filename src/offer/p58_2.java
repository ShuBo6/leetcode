package offer;

public class p58_2 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(0,n)+s.substring(n,s.length());
    }
}
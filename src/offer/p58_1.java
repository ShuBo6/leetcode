package offer;

public class p58_1 {
    public String reverseWords(String s) {
        StringBuffer res=new StringBuffer();
        String[] strs = s.trim().split(" +");
        for (int i = strs.length - 1; i >= 0; i--) {
                res.append(strs[i] + " ") ;
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new p58_1().reverseWords("a good   example"));
    }
}
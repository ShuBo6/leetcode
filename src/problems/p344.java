package problems;

import java.util.Arrays;

public class p344 {
    public void reverseString(char[] s) {
        if(s.length==0||s==null){
            return;
        }
        int left=0;
        int right=s.length-1;
        r(s,left,right);

        

    }
    public void r(char[] s,int left,int right){
        if(left>=right) return;
        r(s,left+1,right-1);
        char temp=s[right];
        s[right]=s[left];
        s[left]=temp;
    }
   
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        new p344().reverseString(s);
        System.out.println(Arrays.toString(s));
        
        
        

    }
}
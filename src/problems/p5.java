package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//5. 最长回文子串
public class p5 {
    public String longestPalindrome(String s) {

        char[] chars=s.toCharArray();
        int rk=0;
        String maxStr="";
        ArrayList<Character> arrayList=new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (i!=0){
                arrayList.remove(i-1);
            }
            while (rk<chars.length&&!isPalindrome(arrayList)){

                arrayList.add(chars[rk++]);
            }
            if (arrayList.size()>maxStr.length()){
                maxStr=arrayList.toString();
            }
        }
        return maxStr;
    }
    public static boolean isPalindrome(ArrayList<Character> arr){
        int i=0;
        int j=arr.size()-1;
        boolean flag=true;
        while (i<j){

            flag=(arr.get(i++)==arr.get(j--));
        }
        return flag;
    }

    public static void main(String[] args) {
        char[] a={'c','a','d','r','e','d','a','c'};

//        System.out.println(""+isPalindrome(a));
//        String str="babad";
//        System.out.println(new p5().longestPalindrome(str));
    }
}

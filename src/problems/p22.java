package problems;

import java.util.ArrayList;
import java.util.List;
public class p22 {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate(0, 0, n, list , "");

        return list;
    }
    public void generate(int l,int r,int n,List<String> list,String str){

        
        if(l==r && l==n){ list.add(str); return; }

        if(l<n && l>=r){  generate(l+1, r, n, list, str+"(");  }
        if(r<n){  generate(l, r+1, n, list, str+")");  }
        if(r>l) {return;}
    }
    public static void main(String[] args) {
        // for (String string : new p22().generateParenthesis(3)) {
        //     System.out.println(string );
        // }
        System.out.println(new p22().generateParenthesis(3));
        
    }
}
package problems;
import java.util.ArrayList;
import java.util.List;

public class p77 {
    public List<List<Integer>> combine(int n, int k) {
       
        List<List<Integer>> res =new ArrayList<>();
        if(n < k || k == 0){
            return res;
        }
        combination(new ArrayList<>(), res, 1,0, n, k);
        return res;
    }
    // public int getCombinationLen(int n, int k){
    //     int len=0;
    //     if(k==1) return n;
    //     for (int i = n-1; i>k; i--) {
    //         n*=i;
    //     }
    //     len=n/2;
    //     return len;
    // }
    public void combination(List<Integer> curList,List<List<Integer>> res,int begin,int curIndex,int n,int k){
        if(curIndex==k){ res.add(new ArrayList<>(curList)); }
        else{
            for (int i = begin; i <= n; i++) {
                curList.add(i);
                combination(curList, res, i+1, curIndex+1,n, k);
                curList.remove(curList.size()-1);
            }
        }
    }
    // private void dfs(List<List<Integer>> res, List<Integer> curList, int n, int k, int begin, int curIndex){
    //     if(curIndex == k){
    //         res.add(new ArrayList<>(curList));
    //     }else{
    //         for(int i = begin; i <= n; i++){
    //             curList.add(i);
    //             dfs(res, curList, n, k, i + 1, curIndex + 1);
    //             curList.remove(curList.size() - 1);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        // System.out.println(new p77().getCombinationLen(4, 2));
        // System.out.println(new p77().getCombinationLen(1, 1));
        System.out.println(new p77().combine(4, 2));
    }
}
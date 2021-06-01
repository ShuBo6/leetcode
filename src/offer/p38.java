package offer;

import java.util.*;

public class p38 {
//
//    List<String> list=new LinkedList<String>();
//    char[] c;
//    public String[] permutation(String s) {
//        c=s.toCharArray();
//        dfs(0);
//
//        return list.toArray(new String[list.size()]);
//    }
//    void dfs(int indexCur)
//    {
//        if (indexCur==c.length-1){
//            list.add(String.valueOf(c));
//            return;
//        }
//        HashSet<Character> hashSet=new HashSet<>();
//        for (int i = indexCur; i < c.length; i++) {
//            if (hashSet.contains(c[i])){
//                continue;
//            }
//            hashSet.add(c[i]);
//            swap(i,indexCur);
//            dfs(indexCur+1);
//            swap(i,indexCur);
//        }
//
//    }
//    void swap(int x,int y){
//        char temp=c[x];
//        c[x]=c[y];
//        c[y]=temp;
//
//    }
    /**
     该题类似于 全排列2，但是本题不同的是无法通过排序来进行去重剪枝。因此使用set来去除重复元素
     除了使用set去重外，如果是普通的整数数组，则可以对数组排序，使用visited数组进行剪枝！

     */
    Set<String> res = new HashSet();
    public String[] permutation(String s) {

        backtrack(s.toCharArray(),new StringBuilder(), new boolean[s.length()]);
        return res.toArray(new String[0]);

    }

    // 回溯函数
    public void backtrack(char[] ch,StringBuilder sb, boolean[] visitid){
        // 终止条件
        if(sb.length() == ch.length){
            res.add(sb.toString());
            return;
        }
        // 选择列表
        for(int i = 0; i < ch.length; i++){
            // 剪枝，如果当前位置的元素已经使用过，则跳过进入下一个位置
            if(visitid[i]) continue;
            // 做出选择
            sb.append(ch[i]);
            // 更新标记
            visitid[i] = true;
            // 进入下层回溯
            backtrack(ch,sb,visitid);
            // 撤销选择
            sb.deleteCharAt(sb.length()-1);
            visitid[i] = false;

        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new p38().permutation("abc")));
        System.out.println(Arrays.toString(new p38().permutation("qwertyuiop")));
        System.out.println(Arrays.toString(new p38().permutation("asdfghjkl")));
        System.out.println(Arrays.toString(new p38().permutation("zxcvbnm")));
    }
}

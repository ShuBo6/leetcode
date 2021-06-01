package offer;

import DataStructure.TreeNode;

public class p55 {
    int count=0;
    int max=0;
    public int maxDepth(TreeNode root) {
        dfs(root);
        return max;
    }
    void dfs(TreeNode root){
        if(root==null){
            max=Math.max(max, count);
            count=0;
            return;}
        count++;
        dfs(root.left);
        dfs(root.right);
    }
}
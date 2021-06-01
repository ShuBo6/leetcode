package offer;

import DataStructure.TreeNode;

public class p55_2 {
    public boolean isBalanced(TreeNode root) {
        boolean flag = false;
        if (root == null) {
            return true;
        }

        flag = Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;
        while (root != null) {
            isBalanced(root.left);
        }

        return flag;
    }

    int count = 0;
    int max = 0;

    public int maxDepth(TreeNode root) {
        dfs(root);
        return max;
    }

    void dfs(TreeNode root) {
        if (root == null) {
            max = Math.max(max, count);
            count = 0;
            return;
        }
        count++;
        dfs(root.left);
        dfs(root.right);
    }
}
package problems;

import DataStructure.TreeNode;

public class p938 {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {

        dfs(root, low, high);
        return sum;
    }

    public void dfs(TreeNode root, int low, int high) {

        if (root == null) {
            return;
        }
        dfs(root.left, low, high);
        dfs(root.right, low, high);
        if (root.val >= low && root.val <= high) {
            sum += root.val;
            return;
        }
        return;
    }

    public static void main(String[] args) {
        TreeNode node3_1 = new TreeNode(3);
        TreeNode node3_2 = new TreeNode(7);
        TreeNode node3_3 = new TreeNode(18);
        TreeNode node2_1 = new TreeNode(5, node3_1, node3_2);
        TreeNode node2_2 = new TreeNode(15, null, node3_3);
        TreeNode node1_1 = new TreeNode(10, node2_1, node2_2);
        // TreeNode node3_1=new TreeNode(3);

        System.out.println(new p938().rangeSumBST(node1_1, 7, 15));
    }
}
package offer;

import DataStructure.TreeNode;

public class p27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;
    }
}
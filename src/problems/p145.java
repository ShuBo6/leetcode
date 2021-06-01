package problems;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class p145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}

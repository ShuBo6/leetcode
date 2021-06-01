package offer;

import java.util.*;

import DataStructure.TreeNode;

public class p54 {

    List<Integer> list = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        helper(root);
        return list.get(list.size()-k);
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }

    public static void main(String[] args) {
        TreeNode node4 = new TreeNode(1);
        TreeNode node3_1 = new TreeNode(2, node4, null);
        TreeNode node3_2 = new TreeNode(4);
        TreeNode node2_1 = new TreeNode(3, node3_1, node3_2);
        TreeNode node2_2 = new TreeNode(6);
        TreeNode node1 = new TreeNode(5, node2_1, node2_2);

        // new p54().helper(node1);
        System.out.println(new p54().kthLargest(node1, 3));

    }
}
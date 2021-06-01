package problems;

import DataStructure.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class p102 {
    // BFS 层级遍布
    // public List<List<Integer>> levelOrder(TreeNode root) {

    // List<List<Integer>> res = new ArrayList<>();
    // Deque<TreeNode> deque = new LinkedList<>();

    // deque.add(root);

    // while (deque.size() > 0) {
    // List<Integer> curList = new ArrayList<>();
    // int size = deque.size();
    // while (size > 0) {
    // TreeNode curNode = deque.pop();
    // curList.add(curNode.val);
    // if (curNode.left != null) {
    // deque.add(curNode.left);
    // }
    // if (curNode.right != null) {
    // deque.add(curNode.right);
    // }
    // size--;
    // }
    // res.add(curList);

    // }
    // return res;
    // }


    //DFS
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        dfs(res, root, 0);

        return res;
    }

    public void dfs(List<List<Integer>> res, TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level > res.size() - 1) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        dfs(res, root.left, level + 1);
        dfs(res, root.right, level + 1);
    }

    public static void main(String[] args) {
        TreeNode node3_1 = new TreeNode(15);
        TreeNode node3_2 = new TreeNode(7);
        TreeNode node2_1 = new TreeNode(9);
        TreeNode node2_2 = new TreeNode(20, node3_1, node3_2);
        TreeNode node1_1 = new TreeNode(3, node2_1, node2_2);

        System.out.println(new p102().levelOrder(node1_1));

    }
}
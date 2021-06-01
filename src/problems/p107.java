package problems;

import java.util.*;

import DataStructure.TreeNode;

public class p107 {
    // BFS 层级遍布
    // public LinkedList<List<Integer>> levelOrderBottom(TreeNode root) {
    // LinkedList<List<Integer>> res = new LinkedList<>();
    //     if(root==null){
    //         return res;
    //     }
        
    //     Deque<TreeNode> deque = new LinkedList<>();

    //     deque.add(root);

    //     while (deque.size() > 0) {
    //         List<Integer> curList = new ArrayList<>();
    //         int size = deque.size();
    //         while (size > 0) {
    //             TreeNode curNode = deque.pop();
    //             curList.add(curNode.val);
    //             if (curNode.left != null) {
    //                 deque.add(curNode.left);
    //             }
    //             if (curNode.right != null) {
    //                 deque.add(curNode.right);
    //             }
    //             size--;
    //         }

    //         res.addFirst(new ArrayList<> (curList));

    //     }
    //     return res;
    // }



    //DFS
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        dfs(res, root, 0);Collections.reverse(res);
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

        System.out.println(new p107().levelOrderBottom(node1_1));

    }
}
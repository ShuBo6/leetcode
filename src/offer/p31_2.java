package offer;

import DataStructure.TreeNode;

import java.util.*;

public class p31_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null){return new ArrayList<>();}
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){

            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode=queue.poll();
                list.add(curNode.val);
                if (curNode.left!=null){
                    queue.add(curNode.left);
                }
                if (curNode.right!=null){
                    queue.add(curNode.right);
                }
            }
            res.add(list);

        }
        return res;

    }


    public static void main(String[] args) {
        TreeNode node3_2=new TreeNode(7);
        TreeNode node3_1=new TreeNode(15);
        TreeNode node2_2=new TreeNode(20,node3_1,node3_2);
        TreeNode node2_1=new TreeNode(9);
        TreeNode root=new TreeNode(3,node2_1,node2_2);
        System.out.println(new p31_2().levelOrder(root));
        System.out.println(new p31_2().levelOrder(new TreeNode()));
    }
}

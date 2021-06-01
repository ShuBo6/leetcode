package offer;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p31_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();
        if (root==null){return res;}

        Queue<TreeNode> queue =new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            LinkedList<Integer> list=new LinkedList<>();
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode=queue.poll();
                if (res.size()%2==0){
                    list.add(curNode.val);
                }else {
                    list.addFirst(curNode.val);
                }

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
        System.out.println(new p31_3().levelOrder(root));
        System.out.println(new p31_3().levelOrder(new TreeNode()));
    }

}

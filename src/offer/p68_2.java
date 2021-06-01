package offer;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class p68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }

    public static void main(String[] args) {
        TreeNode node4_1=new TreeNode(7);
        TreeNode node4_2=new TreeNode(4);
        TreeNode node3_1=new TreeNode(6);
        TreeNode node3_2=new TreeNode(2,node4_1,node4_2);
        TreeNode node3_3=new TreeNode(0);
        TreeNode node3_4=new TreeNode(8);
        TreeNode node2_1=new TreeNode(5,node3_1,node3_2);
        TreeNode node2_2=new TreeNode(1,node3_3,node3_4);
        TreeNode root=new TreeNode(3,node2_1,node2_2);

        System.out.println(new p68_2().lowestCommonAncestor(root,new TreeNode(5),new TreeNode(1)).val);
        System.out.println(new p68_2().lowestCommonAncestor(root,new TreeNode(5),new TreeNode(4)).val);


    }
}

package offer;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class p68_1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = null;
        List<TreeNode> pathQ = new ArrayList<>();
        List<TreeNode> pathP = new ArrayList<>();
        TreeNode treeQ = root;
        while (treeQ != null) {
            pathQ.add(treeQ);
            if (treeQ.val == q.val) {
                break;
            } else if (treeQ.val > q.val) {
                treeQ = treeQ.left;
            } else {
                treeQ = treeQ.right;
            }
        }
        TreeNode treeP = root;
        while (treeP != null) {
            pathP.add(treeP);
            if (treeP.val == p.val) {
                break;
            } else if (treeP.val > p.val) {
                treeP = treeP.left;
            } else {
                treeP = treeP.right;
            }
        }

        int len=Math.min(pathP.size(),pathQ.size());
        for (int i = 0; i < len; i++) {
            if (pathP.get(i)==pathQ.get(i)){
                res=pathP.get(i);

            }else {
             break;
            }
        }

        return res  ;
    }
    public TreeNode lowestCommonAncestorBetter(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val>q.val){
            TreeNode temp=p;
            p=q;
            q=temp;
        }
        while (root!=null){
            if (root.val<p.val){
                root=root.right;
            }else if (root.val>q.val){
                root=root.left;
            }else {break;}
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode node4_1=new TreeNode(3);
        TreeNode node4_2=new TreeNode(5);
        TreeNode node3_1=new TreeNode(0);
        TreeNode node3_2=new TreeNode(4,node4_1,node4_2);
        TreeNode node3_3=new TreeNode(7);
        TreeNode node3_4=new TreeNode(9);
        TreeNode node2_1=new TreeNode(2,node3_1,node3_2);
        TreeNode node2_2=new TreeNode(8,node3_3,node3_4);
        TreeNode root=new TreeNode(6,node2_1,node2_2);

        System.out.println(new p68_1().lowestCommonAncestorBetter(root,new TreeNode(2),new TreeNode(8)).val);
        System.out.println(new p68_1().lowestCommonAncestorBetter(root,new TreeNode(2),new TreeNode(4)).val);


    }
}

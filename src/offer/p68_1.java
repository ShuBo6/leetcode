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
            if (treeQ == q) {
                break;
            } else if (treeQ.val > q.val) {
                treeQ = treeQ.right;
            } else {
                treeQ = treeQ.left;
            }
        }
        TreeNode treeP = root;
        while (treeP != null) {
            pathP.add(treeP);
            if (treeP == q) {
                break;
            } else if (treeP.val > q.val) {
                treeP = treeP.right;
            } else {
                treeP = treeP.left;
            }
        }

        for (int i = 0; i < pathP.size(); i++) {
            if (pathP.get(i)!=pathQ.get(i)){
                res=pathP.get(i-1);
                break;
            }
        }
        return res  ;
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

        System.out.println(new p68_1().lowestCommonAncestor(root,new TreeNode(2),new TreeNode(8)));
        System.out.println(new p68_1().lowestCommonAncestor(root,new TreeNode(2),new TreeNode(4)));
    }
}

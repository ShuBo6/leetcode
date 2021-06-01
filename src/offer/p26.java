package offer;

import DataStructure.TreeNode;

public class p26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        if (help(A, B)) {
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean help(TreeNode nodeA, TreeNode nodeB) {

        if (nodeB == null) {
            return true;
        }
        if (nodeA == null || nodeA.val != nodeB.val) {
            return false;
        }
        return help(nodeA.left, nodeB.left) && help(nodeA.right, nodeB.right);

    }

    public static void main(String[] args) {
        TreeNode node3_1 = new TreeNode(1);
        TreeNode node3_2 = new TreeNode(2);
        TreeNode node2_1 = new TreeNode(4, node3_1, node3_2);
        TreeNode node2_2 = new TreeNode(5);
        TreeNode node1_1 = new TreeNode(3, node2_1, node2_2);

        TreeNode n2 = new TreeNode(1);
        TreeNode n1 = new TreeNode(4, n2, null);
        System.out.println(new p26().isSubStructure(node1_1, n1));

        System.out.println(new p26().isSubStructure(new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(3, new TreeNode(1), null)));

    }
}
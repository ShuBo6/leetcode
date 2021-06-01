package problems;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class p144 {


//        public List<Integer> preorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<>();
//            Deque<TreeNode> stack = new LinkedList<>();
//            if (root == null) {
//                return res;
//            }
//
//            while (root != null || !stack.isEmpty()) {
//
//                while (root != null) {
//                    res.add(root.val);
//                    stack.push(root);
//                    root = root.left;
//                }
//                root = stack.pop();
//                root = root.right;
//            }
//            return res;
//        }


        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<Integer>();
            preorder(root, res);
            return res;
        }

        public void preorder(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }

//        public List<Integer> preorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<Integer>();
//            if (root == null) {
//                return res;
//            }
//
//            TreeNode p1 = root, p2 = null;
//
//            while (p1 != null) {
//                p2 = p1.left;
//                if (p2 != null) {
//                    while (p2.right != null && p2.right != p1) {
//                        p2 = p2.right;
//                    }
//                    if (p2.right == null) {
//                        res.add(p1.val);
//                        p2.right = p1;
//                        p1 = p1.left;
//                        continue;
//                    } else {
//                        p2.right = null;
//                    }
//                } else {
//                    res.add(p1.val);
//                }
//                p1 = p1.right;
//            }
//            return res;
//        }


}

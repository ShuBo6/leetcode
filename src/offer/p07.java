package offer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import DataStructure.TreeNode;

public class p07 {
    // 递归法
    // public TreeNode buildTree(int[] preorder, int[] inorder) {
    // int len = preorder.length;
    // if(len==0){
    // return null;
    // }
    // int rootVal=preorder[0];
    // TreeNode root=new TreeNode(rootVal);
    // int index=0;
    // for (int i = 0; i < len; i++) {
    // if(inorder[i]==rootVal){
    // index=i;
    // }
    // }

    // root.left=buildTree(Arrays.copyOfRange(preorder, 1, 1+index),
    // Arrays.copyOfRange(inorder, 0, index));
    // root.right=buildTree(Arrays.copyOfRange(preorder, 1+index, len),
    // Arrays.copyOfRange(inorder, index+1, len));

    // return root;

    // }

    // 二叉树重建 迭代法，有点难
    //题解地址：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/solution/mian-shi-ti-07-zhong-jian-er-cha-shu-by-leetcode-s/
    // public TreeNode buildTree(int[] preorder, int[] inorder) {

    //     int len = preorder.length;

    //     if(len==0 || preorder==null){
    //         return null;
    //     }
    //     int rootVal=preorder[0];
    //     TreeNode root=new TreeNode(rootVal);

    //     Deque<Integer> stack=new LinkedList<>();





    //     return root;
    // }
}
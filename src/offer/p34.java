package offer;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class p34 {
    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<List<Integer>> res=new ArrayList<>();if (root==null){return res;}
        backtrack(root,target,res,new ArrayList<>());
        return res;
    }
    void backtrack(TreeNode root, int target,List<List<Integer>> res,List<Integer> curList){
        if (root==null) {            return;}

        curList.add(root.val);
        target-=root.val;
        if (root.left==null&&root.right==null&& target==0){
            res.add(new ArrayList<>(curList));
        }else {
            backtrack(root.left,target,res,curList);backtrack(root.right,target,res,curList);
        }

        curList.remove(curList.size()-1);
    }

    public static void main(String[] args) {
        TreeNode node4_1 =new TreeNode(7);
        TreeNode node4_2 =new TreeNode(2);
        TreeNode node4_3 =new TreeNode(5);
        TreeNode node4_4 =new TreeNode(1);
        TreeNode node3_1 =new TreeNode(11,node4_1,node4_2);
        TreeNode node3_2 =new TreeNode(13);
        TreeNode node3_3 =new TreeNode(4,node4_3,node4_4);
        TreeNode node2_1 =new TreeNode(4,node3_1,null);
        TreeNode node2_2 =new TreeNode(8,node3_2,node3_3);
        TreeNode root =new TreeNode(5,node2_1,node2_2);

        System.out.println(new p34().pathSum(root,22));

        System.out.println(new p34().pathSum(new TreeNode(-2,null,new TreeNode(3)),-2));

    }
}

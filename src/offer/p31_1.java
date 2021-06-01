package offer;

import DataStructure.TreeNode;

import java.util.*;

public class p31_1 {
    public int[] levelOrder(TreeNode root) {
        if (root==null){return new int[0];}
        List<Integer> resList=new ArrayList<>();
        bfs(resList,root);
//        int[] res=new int[resList.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i]=resList.get(i);
//        }
        return resList.stream().mapToInt(Integer::intValue).toArray();

    }
    void bfs(List<Integer> resList,TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int i=0;
        while (!queue.isEmpty()){
            TreeNode cur=queue.poll();
//            res[i++]=cur.val;
            resList.add(cur.val);
            if (cur.left!=null){
                queue.add(cur.left);
            }
            if (cur.right!=null){
                queue.add(cur.right);
            }
        }

    }

    public static void main(String[] args) {
        TreeNode node3_2=new TreeNode(7);
        TreeNode node3_1=new TreeNode(15);
        TreeNode node2_2=new TreeNode(20,node3_1,node3_2);
        TreeNode node2_1=new TreeNode(9);
        TreeNode root=new TreeNode(3,node2_1,node2_2);

        System.out.println(Arrays.toString(new p31_1().levelOrder(root)));
    }

}

package offer;

import DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class p37 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root==null){return "[]";}
            String res="[";
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                TreeNode cur=queue.poll();
                if (cur!=null){
                    res+=cur.val+",";
                        queue.offer(cur.left);
                        queue.offer(cur.right);

                }else {
                    res+="null,";
                }
            }
            res=res.substring(0,res.length()-1);
            return res+"]";
        }


        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.equals("[]")) return null;
            String[] vals = data.substring(1, data.length() - 1).split(",");
            TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
            Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
                add(root);
            }};
            int i = 1;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (!vals[i].equals("null")) {
                    node.left = new TreeNode(Integer.parseInt(vals[i]));
                    queue.add(node.left);
                }
                i++;
                if (!vals[i].equals("null")) {
                    node.right = new TreeNode(Integer.parseInt(vals[i]));
                    queue.add(node.right);
                }
                i++;
            }
            return root;
        }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));


        public static void main(String[] args) {
            TreeNode node3_1=new TreeNode(4);
            TreeNode node3_2=new TreeNode(5);
            TreeNode node2_2=new TreeNode(3,node3_1,node3_2);
            TreeNode node2_1=new TreeNode(2);
            TreeNode root=new TreeNode(1,node2_1,node2_2);

            System.out.println(new p37().serialize(root));
        }
}

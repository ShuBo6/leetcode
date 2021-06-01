package Common;

import DataStructure.TreeNode;
import problems.p144;
import problems.p145;
import problems.p94;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TreeTraversal {

    public static void main(String[] args) {

        TreeNode fourth = new TreeNode(6);
        TreeNode third1 = new TreeNode(4, null, fourth);
        TreeNode third2 = new TreeNode(5);
        TreeNode second1 = new TreeNode(2, third1, null);
        TreeNode second2 = new TreeNode(3, null, third2);
        TreeNode root = new TreeNode(1, second1, second2);


        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');
        map.put(4, 'D');
        map.put(5, 'E');
        map.put(6, 'F');


        //前序遍历
        List<Integer> res = new p144().preorderTraversal(root);
        for (Integer x : res) {
            System.out.print(map.get(x));
        }
        System.out.println();
        //中序遍历
        List<Integer> res1 = new p94().inorderTraversal(root);
        for (Integer x : res1) {
            System.out.print(map.get(x));
        }
        System.out.println();

        //后序遍历
        List<Integer> res2 = new p145().postorderTraversal(root);
        for (Integer x : res2) {
            System.out.print(map.get(x));
        }
        System.out.println();
    }
}

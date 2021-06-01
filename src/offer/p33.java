package offer;

public class p33 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    boolean recur(int[] postorder,int start,int end){
        if (start>=end){return true;}
        int p=start;
        while (postorder[p]<postorder[end]){
            p++;
        }
        int m=p;
        while (postorder[p]>postorder[end]){
            p++;
        }
        return p==end && recur(postorder,start,m-1) && recur(postorder,m,end-1);
    }

}

package offer;

import java.util.Arrays;

public class p29 {
    public static final int TOP = 1;
    public static final int RIGHT = 2;
    public static final int BOTTOM = 3;
    public static final int LEFT = 4;

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] res = new int[rows * cols];
        int index=0;
        int left=0,right=cols-1,top=0,bottom=rows-1;
        while (left<=right&&top<=bottom){
            for (int i = left; i <= right; i++) {
                res[index++]=matrix[top][i];
            }
            for (int i = top+1; i <=bottom ; i++) {
                res[index++]=matrix[i][right];
            }
            if (left<right&&top<bottom){
                for (int i = right-1; i >left ; i--) {
                    res[index++]=matrix[bottom][i];
                }
                for (int i = bottom; i >top ; i--) {
                    res[index++] =matrix[i][left];
                }
            }
            left++;
            right--;
            bottom--;
            top++;
        }
        return res;
    }



    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] res = new p29().spiralOrder(matrix);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(new p29().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}})));


    }

}
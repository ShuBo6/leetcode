package offer;

public class p04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0 || matrix[0].length==0){return false;}
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row=0,col=cols-1;
        while(row<rows&& col>=0){
            if(target==matrix[row][col]){return true;}
            else if(target>matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false; 
    }


    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };

        System.out.println(new p04().findNumberIn2DArray(matrix, 5));
        System.out.println(new p04().findNumberIn2DArray(matrix, 20));
        int[][] matrix1 ={{}};
        System.out.println(new p04().findNumberIn2DArray(matrix1,1));
        int[][] matrix2={};
        System.out.println(new p04().findNumberIn2DArray(matrix2,1));
    }
}
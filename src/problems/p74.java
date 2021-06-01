package problems;

public class p74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=row*col-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (matrix[mid/col][mid%col]==target){
                return true;
            }else if (matrix[mid/col][mid%col]<target){
                left=mid+1;
            }else {
                right=mid;
            }
        }
        return matrix[left/col][left%col]==target;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix1={{1}};
        int[][] matrix2={{1,3}};
        int[][] matrix5={{1,3,5}};
        int[][] matrix3={{1,1}};
        int[][] matrix4={{1},{3}};
//        System.out.println(new p74().searchMatrix(matrix,3));
//        System.out.println(new p74().searchMatrix(matrix,13));
//        System.out.println(new p74().searchMatrix(matrix3,0));
        System.out.println(new p74().searchMatrix(matrix2,3));
        System.out.println(new p74().searchMatrix(matrix2,1));
        System.out.println(new p74().searchMatrix(matrix4,2));
        System.out.println(new p74().searchMatrix(matrix5,0));

    }
}
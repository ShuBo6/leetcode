package offer;

public class p47 {
    public int maxValue(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        for (int i = 1; i < cols; i++) {
            grid[0][i]+=grid[0][i-1];
        }
        for (int i = 1; i < rows; i++) {
            grid[i][0]+=grid[i-1][0];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                grid[i][j]+=Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[rows-1][cols-1];
    }

    static class Solution {
        public int maxValue(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            for(int j = 1; j < n; j++) // 初始化第一行
                grid[0][j] += grid[0][j - 1];
            for(int i = 1; i < m; i++) // 初始化第一列
                grid[i][0] += grid[i - 1][0];
            for(int i = 1; i < m; i++)
                for(int j = 1; j < n; j++)
                    grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            return grid[m - 1][n - 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(new p47().maxValue(new int[][] {{1,2,5},{3,2,1}}));
        System.out.println(new Solution().maxValue(new int[][] {{1,2,5},{3,2,1}}));
    }
}

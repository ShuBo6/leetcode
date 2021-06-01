package offer;

public class p13 {
    // int max = 0;

    public int movingCount(int m, int n, int k) {
        int count = 0;
        boolean[][] map = new boolean[m][n];
        dfs(0, 0, m, n, k, map);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j]) {
                    count++;

                }
            }
        }
        return count;
    }

    public void dfs(int x, int y, int m, int n, int k, boolean[][] map) {
        if (x >= m || x < 0 || y >= n || y < 0 || (x / 100 + x / 10 % 10 + x % 10 + y / 100 + y / 10 % 10 + y % 10) > k
                || map[x][y]) {
            return;
        }
        map[x][y] = true;
        // max = Math.max(max, count);
        dfs(x + 1, y, m, n, k, map);
        dfs(x - 1, y, m, n, k, map);
        dfs(x, y + 1, m, n, k, map);
        dfs(x, y - 1, m, n, k, map);

    }

    public static void main(String[] args) {
        System.out.println(new p13().movingCount(2, 3, 1));
        System.out.println(new p13().movingCount(3, 1, 0));
    }

}
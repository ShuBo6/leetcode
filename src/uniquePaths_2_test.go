package src

import "testing"

func TestUniquePathsWithObstacles(t *testing.T) {
	t.Log(uniquePathsWithObstacles([][]int{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}))
	t.Log(uniquePathsWithObstacles([][]int{{0, 1}, {0, 0}}))
	t.Log(uniquePathsWithObstacles([][]int{{0, 0}, {1, 0}}))
	t.Log(uniquePathsWithObstacles([][]int{{1}}))

}

// 方格地图 左上角 走到右下角有多少种路径(有障碍)

func uniquePathsWithObstacles(obstacleGrid [][]int) int {
	var (
		m = len(obstacleGrid)
		n = len(obstacleGrid[0])
	)
	if obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1 {
		return 0
	}

	var dp = make([][]int, m)
	for i, _ := range dp {
		dp[i] = make([]int, n)
	}
	for i := 0; i < m && obstacleGrid[i][0] == 0; i++ {
		dp[i][0] = 1
	}
	for i := 0; i < n && obstacleGrid[0][i] == 0; i++ {
		dp[0][i] = 1
	}
	for i := 1; i < m; i++ {
		for j := 1; j < n; j++ {
			if obstacleGrid[i][j] == 1 {
				continue
			}
			dp[i][j] = dp[i-1][j] + dp[i][j-1]
		}
	}
	return dp[m-1][n-1]
}

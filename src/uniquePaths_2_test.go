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
	m, n := len(obstacleGrid), len(obstacleGrid[0])
	//如果在起点或终点出现了障碍，直接返回0
	if obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1 {
		return 0
	}
	// 定义一个dp数组
	dp := make([][]int, m)
	for i, _ := range dp {
		dp[i] = make([]int, n)
	}
	// 初始化, 如果是障碍物, 后面的就都是0, 不用循环了
	for i := 0; i < m && obstacleGrid[i][0] == 0; i++ {
		dp[i][0] = 1
	}
	for i := 0; i < n && obstacleGrid[0][i] == 0; i++ {
		dp[0][i] = 1
	}
	// dp数组推导过程
	for i := 1; i < m; i++ {
		for j := 1; j < n; j++ {
			// 如果obstacleGrid[i][j]这个点是障碍物, 那么dp[i][j]保持为0
			if obstacleGrid[i][j] != 1 {
				// 否则我们需要计算当前点可以到达的路径数
				dp[i][j] = dp[i-1][j] + dp[i][j-1]
			}
		}
	}
	return dp[m-1][n-1]
}

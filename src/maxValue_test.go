package src

// 在一个 m*n 的棋盘的每一格都放有一个礼物，
// 每个礼物都有一定的价值（价值大于 0）。
// 你可以从棋盘的左上角开始拿格子里的礼物，
// 并每次向右或者向下移动一格、直到到达棋盘的右下角。
// 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？

// 由条件：移动方向是左上角每次向下或者向右，且取当前能拿到的最大值
// 推出 递推公式 dp[i,j]=max(dp[i-1][j],dp[i][j-1])+grid[i][j]
// 初始化 dp[0,0] = grid[0][0]
//
//	dp[0][j] = dp[0][j-1] + grid[0][j]
//	dp[i][0] = dp[i-1][0] + grid[i][0]
func maxValue(grid [][]int) int {
	for i := 1; i < len(grid); i++ {
		grid[i][0] += grid[i-1][0]
	}
	for i := 1; i < len(grid[0]); i++ {
		grid[0][i] += grid[0][i-1]
	}
	for i := 1; i < len(grid); i++ {
		for j := 1; j < len(grid[0]); j++ {
			grid[i][j] = max(grid[i-1][j], grid[i][j-1]) + grid[i][j]
		}
	}
	return grid[len(grid)-1][len(grid[0])-1]
}

package src

import (
	"testing"
)

// 给定一个正整数 n ，将其拆分为 k 个 正整数 的和（ k >= 2 ），并使这些整数的乘积最大化。
// 返回 你可以获得的最大乘积 。
func integerBreak(n int) int {
	var dp = make([]int, n+1)
	dp[1] = 1
	dp[2] = 1
	for i := 3; i < n+1; i++ {
		for j := 1; j <= i/2; j++ {
			dp[i] = max(dp[i], max(j*(i-j), j*dp[i-j]))
		}
	}
	return dp[n]
}
func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
func TestIntegerBreak(t *testing.T) {
	t.Log(integerBreak(10))
	t.Log(integerBreak(2))
	t.Log(integerBreak(3))
}

package src

import "testing"

// 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？返回满足题意的二叉搜索树的种数。
// 有一种神奇的魔法叫做 组合数学，有一种神奇的数字叫做 卡特兰数
func numTrees(n int) int {
	var dp = make([]int, n+1)
	dp[0] = 1
	for i := 1; i <= n; i++ {
		for j := 1; j <= i; j++ {
			dp[i] += dp[j-1] * dp[i-j]
		}
	}
	return dp[n]
}

func TestNumTrees(t *testing.T) {
	t.Log(numTrees(2))
	t.Log(numTrees(3))
	t.Log(numTrees(5))
	t.Log(numTrees(57))
}

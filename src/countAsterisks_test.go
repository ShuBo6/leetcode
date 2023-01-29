package src

import "testing"

// 给你一个字符串 s ，每 两个 连续竖线 '|' 为 一对 。换言之，第一个和第二个 '|' 为一对，第三个和第四个 '|' 为一对，以此类推。
//
// 请你返回 不在 竖线对之间，s 中 '*' 的数目。
//
// 注意，每个竖线 '|' 都会 恰好 属于一个对。
func countAsterisks(s string) int {

	var (
		left  = -1
		right = -1
		ret   []byte
		ans   int
	)

	for i, c := range s {
		ret = append(ret, byte(c))
		if c == '|' && left == -1 {
			left = i
			continue
		}
		if c == '|' && left != -1 {
			right = i
		}
		if c == '|' && left != -1 && right != -1 {
			ret = ret[:len(ret)-right+left-1]
			right = -1
			left = -1
		}

	}
	for _, b := range ret {
		if b == '*' {
			ans++
		}
	}
	return ans
}
func TestCountAsterisks(t *testing.T) {
	t.Log(countAsterisks("l|*e*et|c**o|*de|"))
	t.Log(countAsterisks("iamprogrammer"))
	t.Log(countAsterisks("yo|uar|e**|b|e***au|tifu|l"))
}

package src

import (
	"sort"
	"testing"
)

func mergeSimilarItems(items1 [][]int, items2 [][]int) [][]int {
	var hash = map[int]int{}
	for _, v := range append(items1, items2...) {
		hash[v[0]] += v[1]
	}
	var ret [][]int
	for k, v := range hash {
		ret = append(ret, []int{k, v})
	}
	sort.Slice(ret, func(i, j int) bool {
		return ret[i][0] < ret[j][0]
	})
	return ret
}
func TestMergeSimilarItems(t *testing.T) {
	mergeSimilarItems([][]int{{1, 1}, {4, 5}, {3, 8}}, [][]int{{3, 1}, {1, 5}})
}

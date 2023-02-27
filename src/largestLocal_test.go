package src

import (
	"fmt"
	"testing"
)

func largestLocal(grid [][]int) [][]int {
	width := len(grid)
	height := len(grid[0])
	var ret = make([][]int, width-2)
	for i, _ := range ret {
		ret[i] = make([]int, height-2)
	}
	for i := 0; i < width-2; i++ {
		for j := 0; j < height-2; j++ {
			//ret[i][j] = max(grid[i][j], max(grid[i+1][j], max(grid[i+2][j], max(grid[i][j+1], max(grid[i][j+2], max(grid[j+1][i+1], max(grid[j+1][i+2], max(grid[j+2][i+2], grid[j+2][i+1]))))))))
			for x := i; x <= i+2; x++ {
				for y := j; y <= j+2; y++ {
					ret[i][j] = max(ret[i][j], grid[x][y])
				}
			}

		}
	}
	return ret
}

//	func max(a, b int) int {
//		if a > b {
//			return a
//		}
//		return b
//	}
func TestLargestLocal(t *testing.T) {
	//grid := [][]int{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}

	grid := [][]int{{20, 8, 20, 6, 16, 16, 7, 16, 8, 10}, {12, 15, 13, 10, 20, 9, 6, 18, 17, 6}, {12, 4, 10, 13, 20, 11, 15, 5, 17, 1}, {7, 10, 14, 14, 16, 5, 1, 7, 3, 11}, {16, 2, 9, 15, 9, 8, 6, 1, 7, 15}, {18, 15, 18, 8, 12, 17, 19, 7, 7, 8}, {19, 11, 15, 16, 1, 3, 7, 4, 7, 11}, {11, 6, 5, 14, 12, 18, 3, 20, 14, 6}, {4, 4, 19, 6, 17, 12, 8, 8, 18, 8}, {19, 15, 14, 11, 11, 13, 12, 6, 16, 19}}
	fmt.Println(largestLocal(grid))
}

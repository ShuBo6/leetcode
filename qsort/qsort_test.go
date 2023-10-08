package main

import "testing"

func TestQSort(t *testing.T) {
	t.Log(qSort([]int{3, 4, 2, 1, 65}))
	t.Log(qSort([]int{8, 6, 23, 8, 1}))
	var a = []int{8, 6, 23, 8, 1}
	t.Log(a[:5])
	t.Log(a[5:])
	t.Log(a[len(a):])
}

// 快速排序
func qSort(arr []int) []int {
	pivot := partition(arr, 0, len(arr)-1)
	if len(arr) <= 1 {
		return arr
	}
	qSort(arr[:pivot])
	qSort(arr[pivot:])
	return arr
}

func partition(arr []int, left, right int) (pivot int) {
	if left >= right {
		return
	}
	pivot = left
	cursor := pivot + 1
	for i := pivot + 1; i <= right; i++ {
		if arr[i] < arr[pivot] {
			arr[i], arr[cursor] = arr[cursor], arr[i]
			cursor++
		}
	}
	arr[pivot], arr[cursor-1] = arr[cursor-1], arr[pivot]
	return cursor
}

package main

// 完全二叉树是除了叶子结点以外，其他所有节点左右子树不能为空
// 由于是完全二叉树，根据树的特性完全可以使用数组来表示二叉树
// 对于数组中的节点i，他的父节点为 floor(i/2) 他的左子树为 i*2,右子树为 i*2+1

type maxHeap []int

// 堆的常用操作
// 最大堆
//var maxHeap maxHeap

// 入堆
func (h maxHeap) insert(x int) {
	h = append(h, x)
	if len(h) <= 1 {
		return
	}
	xIdx := len(h) - 1
	parent := (len(h) - 1) / 2
	for h[parent] < h[xIdx] {
		h[parent], h[xIdx] = h[xIdx], h[parent]
		xIdx = parent
		parent = xIdx / 2
	}

}

// 弹出堆顶 , 将数组最后一个元素放到堆顶，然后排序
func (h maxHeap) pop() int {
	if len(h) == 0 {
		return -1
	}
	top := h[0]
	h[0] = h[len(h)-1]
	h = h[:len(h)-1]

	return top
}

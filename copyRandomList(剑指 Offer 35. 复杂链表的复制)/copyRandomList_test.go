package main

import "testing"

/**
* Definition for a Node.
* type Node struct {
*     Val int
*     Next *Node
*     Random *Node
* }
 */
type Node struct {
	Val    int
	Next   *Node
	Random *Node
}

// 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
// 递归
func copyRandomList(head *Node) *Node {
	var mp = map[*Node]*Node{}
	var r func(node *Node) *Node
	r = func(node *Node) *Node {
		if node == nil {
			return nil
		}
		if newNode, ok := mp[node]; ok {
			return newNode
		}

		newNode := &Node{Val: node.Val}
		mp[node] = newNode
		newNode.Random = r(node.Random)
		newNode.Next = r(node.Next)
		return newNode
	}
	return r(head)
}

// 无脑暴力记忆法
func copyRandomListBaoli(head *Node) *Node {
	if head == nil {
		return nil
	}
	var randomIdx = map[int]*int{}      // k 是当前节点索引，v是random节点的索引
	var randomPtrIdx = map[int]*Node{}  // k 是当前节点索引，v是random节点的指针
	var retNodeIdx = map[int]*Node{}    // k是某个节点索引，v是该节点的指针
	var retNodePtrIdx = map[*Node]int{} // k是某个节点指针，v是该节点的索引
	var nodeIdx = map[int]*Node{}
	var nodePtrIdx = map[*Node]int{}
	var idx = 0

	var ret = &Node{}
	cursor := head
	retCursor := ret
	// 复制链表，同时记录randomIdx和nodeIdx
	for cursor != nil {
		// 复制当前节点值
		retCursor.Val = cursor.Val
		//记忆原始节点索引和node指针
		nodeIdx[idx] = cursor
		nodePtrIdx[cursor] = idx
		//记忆新节点索引和node指针
		retNodeIdx[idx] = retCursor
		retNodePtrIdx[retCursor] = idx
		// 记忆原始节点索引和Random指针
		randomPtrIdx[idx] = cursor.Random
		if cursor.Next != nil {
			retCursor.Next = &Node{}
		}
		retCursor = retCursor.Next
		cursor = cursor.Next
		idx++
	}
	// 将新节点索引和random的索引填入
	for i, node := range randomPtrIdx {
		if v, ok := nodePtrIdx[node]; ok {
			randomIdx[i] = &v
		}
	}
	retCursor = ret
	idx = 0
	for retCursor != nil {
		if randomIdx[idx] != nil {
			retCursor.Random = retNodeIdx[*randomIdx[idx]]
		}
		retCursor = retCursor.Next
		idx++
	}
	return ret
}

func TestCopyRandomList(t *testing.T) {
	//[[7,null],[13,0],[11,4],[10,2],[1,0]]

	node0 := &Node{Val: 7}
	node1 := &Node{Val: 13}
	node2 := &Node{Val: 11}
	node3 := &Node{Val: 10}
	node4 := &Node{Val: 1}
	node0.Next = node1
	node0.Random = nil
	node1.Next = node2
	node1.Random = node0
	node2.Next = node3
	node2.Random = node4
	node3.Next = node4
	node3.Random = node2
	node4.Next = nil
	node4.Random = node0
	copyRandomList(node0)

}

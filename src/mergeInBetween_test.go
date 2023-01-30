package src

import "testing"

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
type ListNode struct {
	Val  int
	Next *ListNode
}

func convertListNode(input []int) *ListNode {
	var l ListNode
	var cur = &ListNode{}
	l.Next = cur
	for i := 0; i < len(input); i++ {
		cur.Val = input[i]
		if i < len(input)-1 {
			cur.Next = &ListNode{}
			cur = cur.Next
		}

	}
	return l.Next
}
func printListNode(l *ListNode) (output []int) {
	for l != nil {
		output = append(output, l.Val)
		l = l.Next
	}
	return
}
func TestListNodePrint(t *testing.T) {
	var input = []int{0, 1, 2, 3, 4, 5}
	l := convertListNode(input)
	t.Log(printListNode(l))
}
func mergeInBetween(list1 *ListNode, a int, b int, list2 *ListNode) *ListNode {
	var prev1, prev2 ListNode
	prev1.Next = list1
	prev2.Next = list2

	var end2 *ListNode
	end2 = prev2.Next
	for end2.Next != nil {
		if end2.Next != nil {
			end2 = end2.Next
		}

	}
	idx := 0
	var start1, end1 *ListNode
	for prev1.Next != nil {
		if idx == a-1 {
			start1 = prev1.Next
		}
		if idx == b {
			end1 = prev1.Next
		}
		prev1 = *prev1.Next
		idx++
	}
	start1.Next = list2
	end2.Next = end1.Next
	return list1
}
func TestMergeInBetween(t *testing.T) {
	list1 := convertListNode([]int{0, 1, 2, 3, 4, 5})
	list2 := convertListNode([]int{1000000, 1000001, 1000002})

	mergeInBetween(list1, 3, 4, list2)
	t.Log(printListNode(list1))
}

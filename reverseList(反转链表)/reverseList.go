package main

import (
	"fmt"
	"strings"
)

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	t := reverseList(head.Next)
	head.Next.Next = head // 翻转当前函数栈节点的后继的后继
	head.Next = nil       // 当前函数栈节点的后继置空
	return t              // 返回函数栈顶的节点
}
func printList(head *ListNode) {
	for head != nil {
		fmt.Println(head.Val)
		head = head.Next
	}
	fmt.Println("---------")
	return
}

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
// 将链表分为三部分。
// left前的最后一个node 叫做a
// left，right之间计作d
// right之后计作c
// 记录b的头节点为d
// 反转d 计作b
// a->b
// d->c
// 返回 head
func reverseBetween(head *ListNode, left int, right int) *ListNode {
	if head == nil || left == right {
		return head
	}
	var reverse func(head *ListNode) *ListNode
	reverse = func(head *ListNode) *ListNode {
		if head == nil || head.Next == nil {
			return head
		}
		r := reverse(head.Next)
		head.Next.Next = head
		head.Next = nil
		return r
	}
	cursor := head
	var a, b, c, d *ListNode
	a = nil
	d = head
	idx := 1
	for cursor != nil && cursor.Next != nil {
		if idx+1 == left {
			d = cursor.Next
			a = cursor
		}
		if idx == right {
			c = cursor.Next
			cursor.Next = nil
		}
		idx++
		cursor = cursor.Next
	}
	b = reverse(d)
	if left == 1 {
		head = b
	} else {
		if a != nil {
			a.Next = b
		}
	}

	if d != nil {
		d.Next = c
	}
	return head
}
func reversePrint(head *ListNode) []int {
	var ret []int
	var reverse func(head *ListNode)
	reverse = func(head *ListNode) {
		if head == nil {
			return
		}
		reverse(head.Next)
		ret = append(ret, head.Val)
		return
	}
	reverse(head)

	return ret
}

// 递归
func getKthFromEnd(head *ListNode, k int) *ListNode {

	var cursor *ListNode
	var recur func(head *ListNode)
	recur = func(head *ListNode) {
		if head == nil || head.Next == nil {
			return
		}
		recur(head.Next)
		k--
		if k == 0 {
			cursor = head
			return
		}
		return
	}
	recur(head)
	return cursor
}

// 类似于归并排序
// 比较两个链表head元素的值
func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	if l1 == nil {
		return l2
	}
	if l2 == nil {
		return l1
	}

	l := l1
	r := l2
	if l2.Val < l1.Val {
		l, r = r, l
	}

	// 可以直接将l2  合并 到l1上
	cursor1 := l
	for cursor1 != nil && r != nil {
		if cursor1.Val <= r.Val && (cursor1.Next == nil || (cursor1.Next != nil && cursor1.Next.Val > r.Val)) {
			t := cursor1.Next
			t2 := r
			r = r.Next
			cursor1.Next = t2
			t2.Next = t
		}
		for cursor1 != nil && cursor1.Next != nil && r != nil && cursor1.Next.Val <= r.Val {
			cursor1 = cursor1.Next
		}

	}
	return l
}

func main() {
	//printList(reverseList(&ListNode{Val: 1, Next: &ListNode{Val: 2}}))
	//printList(reverseBetween(&ListNode{Val: 3, Next: &ListNode{Val: 5}}, 1, 2))
	//printList(reverseBetween(&ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 3, Next: &ListNode{Val: 4, Next: &ListNode{Val: 5}}}}}, 2, 4))
	//printList(reverseBetween(&ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 3, Next: &ListNode{Val: 4, Next: &ListNode{Val: 5}}}}}, 3, 4))
	//fmt.Println(reversePrint(&ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 3, Next: &ListNode{Val: 4, Next: &ListNode{Val: 5}}}}}))
	//printList(mergeTwoLists(&ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 4}}}, &ListNode{Val: 1, Next: &ListNode{Val: 3, Next: &ListNode{Val: 4}}}))
	//printList(mergeTwoLists(&ListNode{Val: 2}, &ListNode{Val: 1}))
	//printList(mergeTwoLists(&ListNode{Val: 5}, &ListNode{Val: 1, Next: &ListNode{Val: 2, Next: &ListNode{Val: 4}}}))
	//common := &ListNode{Val: 8, Next: &ListNode{Val: 9}}
	//printList(getIntersectionNode(&ListNode{Val: 1, Next: &ListNode{Val: 2, Next: common}}, &ListNode{Val: 3, Next: &ListNode{Val: 4, Next: &ListNode{Val: 5, Next: common}}}))
	fmt.Println(reverseWords("  hello world!  "))
}

// 双指针便利
func getIntersectionNode(headA, headB *ListNode) *ListNode {
	if headA == nil || headB == nil {
		return nil
	}
	cursorA := headA
	cursorB := headB
	var flagA, flagB bool
	for cursorA != nil || cursorB != nil {
		if cursorA == nil && !flagA {
			cursorA = headB
			flagA = true
		}
		if cursorB == nil && !flagB {
			cursorB = headA
			flagB = true
		}
		if cursorA == cursorB {
			return cursorA
		}
		cursorA = cursorA.Next
		cursorB = cursorB.Next
	}
	return nil
}
func reverseWords(s string) string {
	var ret strings.Builder
	var ss []string
	for i := 0; i < len(s); i++ {
		if s[i] == ' ' {
			continue
		}
		var t []byte
		for j := i; j < len(s); j++ {
			if s[j] == ' ' {
				break
			}
			t = append(t, s[j])
			i = j
		}
		ss = append(ss, string(t))
	}
	for i := len(ss) - 1; i >= 0; i-- {
		ret.WriteString(ss[i])
		if i != 0 {
			ret.WriteString(" ")
		}
	}
	return ret.String()
}

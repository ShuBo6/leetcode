package data_structure

import "github.com/pkg/errors"

type LinkedList struct {
	size int
	next,head *LinkedList
	value interface{}
}
func (this *LinkedList)Push(value interface{})  {
	next:=this.head.next
	newNode:=InitListNode(value,next)
	this.head.next=newNode
	this.size++
}
func (this *LinkedList)constructor() *LinkedList {
	return &LinkedList{}
}
func InitListNode(value interface{},next *LinkedList) *LinkedList {
	return &LinkedList{value: value,next: next}
}

func (this *LinkedList)Pop() (*LinkedList,error) {
	if this.size<1 {
		return nil,errors.New("list.size is < 1,can't pop anything.")
	}else {
		res:=this.head.next
		this.head.next=res
		this.size--
		return res,nil
	}

}
func (this *LinkedList)Len() int {
	return this.size
}
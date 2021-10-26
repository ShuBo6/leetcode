package data_structure

import "github.com/pkg/errors"

type DeLinkedList struct {
	size       int
	head, tail *DeLinkedList
	prev       *DeLinkedList
	next       *DeLinkedList
	value      interface{}
}

func InitDelinkedListNode(value interface{}, prev *DeLinkedList, next *DeLinkedList) *DeLinkedList {
	return &DeLinkedList{
		value: value,
		prev:  prev,
		next:  next,
	}
}
func (this *DeLinkedList)constructor() *DeLinkedList {
	head:=InitDelinkedListNode(nil,nil,nil)
	tail:=InitDelinkedListNode(nil,head,nil)
	head.next=tail
	return &DeLinkedList{
		head: head,
		tail: tail,
	}
}
func (this *DeLinkedList) Push(node *DeLinkedList) {
	this.AddToHead(node)
}
func (this *DeLinkedList) Poll() (*DeLinkedList, error) {
	return this.removeTail()
}
func insertNode(targetNode *DeLinkedList,insertNode *DeLinkedList)  {
		next:=targetNode.next
		targetNode.next=insertNode
		insertNode.prev=targetNode
		insertNode.next=next
		next.prev=insertNode
}
func (this *DeLinkedList) removeTail() (*DeLinkedList,error) {
	if this.size<1 {
		return nil,errors.New("DoubleLinkedList.size is < 1,can't remove anything.")
	}else {
		res:=this.tail.prev
		this.tail.prev.prev.next=this.tail
		this.tail.prev=this.tail.prev.prev
		this.size--
		return res,nil
	}

}
func (this *DeLinkedList) AddToHead(node *DeLinkedList)  {
	this.size++
	insertNode(this.head,node)

}
func (this *DeLinkedList) AddToTail(node *DeLinkedList)  {
	this.size++
	insertNode(this.tail.prev,node)
}
func (this *DeLinkedList)Len() int {
	return this.size
}
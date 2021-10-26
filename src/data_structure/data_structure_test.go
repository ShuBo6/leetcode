package data_structure

import (
	"fmt"
	"testing"
)

func TestQueue(t *testing.T) {
	deList:=&DeLinkedList{}
	deList=deList.constructor()
	deList.Push(InitDelinkedListNode(0,nil,nil))
	deList.Push(InitDelinkedListNode(1,nil,nil))
	deList.Push(InitDelinkedListNode(2,nil,nil))
	deList.Push(InitDelinkedListNode(3,nil,nil))

	fmt.Println(deList.Poll())
	fmt.Println(deList.Poll())
	fmt.Println(deList.Poll())
	fmt.Println(deList.Poll())
}
func TestStack(t *testing.T) {
	s:=new(LinkedList)
	//s:=InitListNode(nil,nil)
	s.Push("A")
	s.Push("B")
	s.Push("C")
	s.Push("D")

	fmt.Println(s.Pop())
	fmt.Println(s.Pop())
	fmt.Println(s.Pop())
	fmt.Println(s.Pop())
	fmt.Println(s.Pop())
}
func TestLevelOrder(t *testing.T) {
	root:=&Tree{left:	&Tree{left: &Tree{value: "D"},right: &Tree{value: "E"},value: "B"} ,right:	&Tree{left: &Tree{value: "F"},right: &Tree{value: "G"},value: "C"},value: "A"}
	fmt.Println(root.levelOrder())
}
func TestMirrorTree(t *testing.T) {
	root:=&Tree{left:	&Tree{left: &Tree{value: "D"},right: &Tree{value: "E"},value: "B"} ,right:	&Tree{left: &Tree{value: "F"},right: &Tree{value: "G"},value: "C"},value: "A"}
	mirror:=root.mirrorTree()
	fmt.Println(root.levelOrder())
	fmt.Println(mirror.levelOrder())
}
package data_structure

type Tree struct {
	value interface{}
	left  *Tree
	right *Tree
}

func (this *Tree)levelOrder() (res []interface{}) {
	q:=&DeLinkedList{}
	q=q.constructor()
	q.Push(InitDelinkedListNode(this,nil,nil))
	for q.Len()!=0 {
		currRoot,_:=q.Poll()
		root:=currRoot.value.(*Tree)
		res=append(res,root.value)
		if root.left!=nil {
			q.Push(InitDelinkedListNode(root.left,nil,nil))
		}
		if root.right!=nil {
			q.Push(InitDelinkedListNode(root.right,nil,nil))
		}
	}
	return res
}
func (this *Tree)mirrorTree() *Tree {
	s:=&LinkedList{}
	s.Push(this)
	for s.Len() != 0 {
		currRoot,_:=s.Pop()
		root:=currRoot.value.(*Tree)
		tmp:=root.left
		root.left=root.right
		root.right=tmp
		if root.left!=nil {
			s.Push(root.left)
		}
		if root.right!=nil {
			s.Push(root.right)
		}
	}
	return this
}
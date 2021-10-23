package src

import "testing"

type LRUCache struct {
	size     int
	capacity int
	head     *DLinkedNode
	tail     *DLinkedNode
	cache    map[int]*DLinkedNode
}
type DLinkedNode struct {
	k    int
	v    int
	prev *DLinkedNode
	next *DLinkedNode
}

func initDLinkedNode(key, value int) *DLinkedNode {
	return &DLinkedNode{
		k: key,
		v: value,
	}
}
func Constructor(capacity int) LRUCache {
	cache := LRUCache{
		capacity: capacity,
		head:     initDLinkedNode(0, 0),
		tail:     initDLinkedNode(0, 0),
		cache:    map[int]*DLinkedNode{},
	}
	cache.head.next = cache.tail
	cache.tail.prev = cache.head
	return cache
}

func (this *LRUCache) Get(key int) int {
	if v, ok := this.cache[key]; !ok {
		return -1
	} else {
		this.moveToHead(v)
		return v.v
	}

}

func (this *LRUCache) Put(key int, value int) {
	if v, ok := this.cache[key]; ok {
		v.v = value
		this.moveToHead(v)
	} else {
		node := initDLinkedNode(key, value)
		this.cache[key] = node
		this.addToHead(node)
		this.size++
		if this.size > this.capacity {
			remove := this.removeTail()
			delete(this.cache, remove.k)
			this.size--
		}
	}
}

func (this *LRUCache) removeNode(node *DLinkedNode) {
	node.prev.next = node.next
	node.next.prev = node.prev
}
func (this *LRUCache) addToHead(node *DLinkedNode) {
	node.prev = this.head
	node.next = this.head.next
	this.head.next.prev = node
	this.head.next = node
}
func (this *LRUCache) moveToHead(node *DLinkedNode) {
	this.removeNode(node)
	this.addToHead(node)
}
func (this *LRUCache) removeTail() *DLinkedNode {
	node := this.tail.prev
	this.removeNode(node)
	return node

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * obj := Constructor(capacity);
 * param_1 := obj.Get(key);
 * obj.Put(key,value);
 */
func TestLRUCache(t *testing.T) {
	//["LRUCache","put","put","get","put","get","put","get","get","get"]
	//	[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
	cache:=Constructor(2)
	cache.Put(1,1)
	cache.Put(2,2)
	cache.Get(1)
	cache.Put(3,3)
	cache.Get(2)
	cache.Put(4,4)
	cache.Get(1)
	cache.Get(3)
	cache.Get(4)
}

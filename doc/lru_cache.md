# LRUCache go语言版

## 思路

1. Last Recently used
2. mapDoubleLinkedList实现，通过map和双链表的绑定，既有map的随机访问性，也有了链表的随机读写性。
3. get和put时，遇到cache中已有的key，将其移动到链表头部，即标记为最近使用。
4. 当cache容量满时，淘汰链表的尾部的节点（tail只是它的边界，tail.prev才是尾部节点）。
5. 双链表通过一对head和tail确定其边界。链表的每一个node保存了map的绑定的key和cache的value，以及它的前驱后继指针。
6. map[int]DoubleLinkedList

```go
package src

import "testing"

type LRUCache struct {
	size     int                  //cache的大小
	capacity int                  //cache的容量
	head     *DLinkedNode         //cache使用的双链表头
	tail     *DLinkedNode         //cache使用的双链表尾
	cache    map[int]*DLinkedNode //map绑定key和链表
}
type DLinkedNode struct {
	k    int //链表保存的键
	v    int //链表保存的值
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
// Get 从cache中找key，找到则返回其value，并将此node移动到链表头部。
func (this *LRUCache) Get(key int) int {
	if v, ok := this.cache[key]; !ok {
		return -1
	} else {
		this.moveToHead(v)
		return v.v
	}

}
// Put 从cache中先看当前key是否已经存在，存在则更新其value，并移动到头部；
// 不存在则创建一个node放到头部，size对应自增；超出容量淘汰尾部node。
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

func TestLRUCache(t *testing.T) {
	//["LRUCache","put","put","get","put","get","put","get","get","get"]
	//	[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
	cache := Constructor(2)
	cache.Put(1, 1)
	cache.Put(2, 2)
	cache.Get(1)
	cache.Put(3, 3)
	cache.Get(2)
	cache.Put(4, 4)
	cache.Get(1)
	cache.Get(3)
	cache.Get(4)
}

```
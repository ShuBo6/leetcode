package src

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"path"
	"strings"
	"testing"
)

var dfsPathArr []string

func TestFilePath(t *testing.T) {
	dfsPath("../")
	//for _, s := range dfsPathArr {
	//	t.Log(s)
	//}
	t.Log(filePath2RelationList())
	b, _ := json.Marshal(relation2Tree(filePath2RelationList()))
	t.Log(string(b))
}

// dfs所有的路径
func dfsPath(root string) {
	dirs, err := ioutil.ReadDir(root)
	if err != nil {
		return
	}
	for _, dir := range dirs {
		curPath := path.Join(root, dir.Name())
		if dir.IsDir() {
			dfsPath(curPath)
		} else {
			dfsPathArr = append(dfsPathArr, curPath[3:len(curPath)])
		}
	}
	return
}

type filePathRelation struct {
	Parent  string
	Current string
	Layer   int
}

func path2Relation(p string) (ret []filePathRelation) {
	sepPath := strings.Split(p, "/")
	sepPath = append([]string{"root"}, sepPath...)
	for i := 0; i < len(sepPath)-1; i++ {
		ret = append(ret, filePathRelation{
			Parent:  sepPath[i],
			Current: sepPath[i+1],
			Layer:   i + 1,
		})
	}
	return
}

func filePath2RelationList() (ret []filePathRelation) {
	var hash = make(map[string]bool)
	for _, s := range dfsPathArr {
		for _, relation := range path2Relation(s) {
			uniqeKey := fmt.Sprintf("%s%s%d", relation.Parent, relation.Current, relation.Layer)
			if !hash[uniqeKey] {
				ret = append(ret, relation)
			}
			hash[uniqeKey] = true
		}
	}
	return
}

type fileTree struct {
	Children []*fileTree
	Current  string
	Layer    int
	Length   int
}

func newFileTreeNode(cur string, layer int) *fileTree {
	return &fileTree{
		Children: make([]*fileTree, 0),
		Current:  cur,
		Layer:    layer,
		Length:   0,
	}
}

// O(N)搜索
func (f *fileTree) findSubNode() (ret []*fileTree) {
	for _, relation := range filePath2RelationList() {
		if relation.Parent == f.Current && relation.Layer == f.Layer+1 {
			ret = append(ret, newFileTreeNode(relation.Current, relation.Layer))
		}
	}
	return
}

//从顶向下找
func relation2Tree(relations []filePathRelation) (trees []*fileTree) {
	for _, relation := range relations {
		if relation.Parent == "root" && relation.Layer == 1 {
			tmp := newFileTreeNode(relation.Current, relation.Layer)
			trees = append(trees, tmp)
			dfsOneRelation(tmp)
		}
	}
	return
}

// dfs 递归构造文件树
func dfsOneRelation(node *fileTree) {
	subNodes := node.findSubNode()
	if len(subNodes) == 0 {
		return
	}
	node.Children = append(node.Children, subNodes...)
	node.Length = len(node.Children)
	for _, subNode := range subNodes {
		dfsOneRelation(subNode)
	}
	return
}

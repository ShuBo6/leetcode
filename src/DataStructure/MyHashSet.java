package DataStructure;

import java.util.LinkedList;

public class MyHashSet {

    LinkedList<Integer> hashset;
    /** Initialize your data structure here. */
    public MyHashSet() {
        hashset=new LinkedList<>();
    }

    public void add(int key) {
        if (!contains(key)){
            hashset.add(key);
        }
    }

    public void remove(int key) {
        hashset.remove((Integer) key);

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return  hashset.contains(key);
    }

}
package offer;

import DataStructure.RandomList.Node;

public class p35 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }

        for (Node node = head, copy = null; node != null; node = node.next.next) {
            copy = new Node(node.val);
            copy.next = node.next;
            node.next = copy;
        }
        for (Node node = head; node != null; node = node.next.next) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }

        }

        Node resHead = head.next;
        for (Node node = head, temp = null; node != null && node.next != null; ) {
            temp = node.next;
            node.next = temp.next;
            node = temp;
        }
        return resHead;
    }

    //[[7,null],[13,0],[11,4],[10,2],[1,0]]
    public static void main(String[] args) {
        Node node = new Node(0);
        Node node1 = new Node(1);
        node1.random = node;
        Node node2 = new Node(2);
        Node node3 = new Node(10);
        node3.random = node2;
        node3.next = node1;
        Node node4 = new Node(4);
        Node node5 = new Node(11);
        node5.random = node4;
        node5.next = node3;
        Node node7 = new Node(13);
        node7.next = node5;
        node7.random = node;
        Node node9 = new Node(7);
        node9.next = node7;
        node9.random = null;

    }
}

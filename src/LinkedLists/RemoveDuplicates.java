package LinkedLists;

import java.util.HashSet;

/**
 * Created by AarKay on 29-Jun-17.
 * www.rakeshgautam.com
 * Write code to remove duplicates from an unsorted linked list.
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node myNode = new Node(0);
        myNode.addNode(8);
        myNode.addNode(2);
        myNode.addNode(3);
        myNode.addNode(8);
        myNode.addNode(6);
        myNode.addNode(1);
        myNode.addNode(8);
        myNode.addNode(5);

        myNode = myNode.removeDuplicates(myNode);

        // display the linked list data
        while (myNode != null) {
            System.out.println(myNode.data);
            myNode = myNode.next;
        }
    }
}

class Node {
    Node next = null;
    int data;

    // Constructor to initialize a new node element
    Node(int d) {
        data = d;
    }

    // add new node at the end of the linked list
    void addNode(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    // delete a node by traversing through the whole list one by one
    private Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    // remove duplicates from the linked list using hash table
    Node removeDuplicates(Node list) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node head = list;
        while (list != null) {
            if (!hashSet.add(list.data)) {
                head = list.deleteNode(head, list.data);
            }
            list = list.next;
        }
        return head;
    }
}

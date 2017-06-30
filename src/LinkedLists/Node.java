package LinkedLists;

/**
 * Created by AarKay on 30-Jun-17.
 * www.rakeshgautam.com
 * A Simple Linked List Node class
 */
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

    // return a node
    Node getNode(int d) {
        Node head = this;
        while (head != null) {
            if (head.data == d) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    // delete a node by traversing through the whole list one by one
    Node deleteNode(Node head, int d) {
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

    // display the linked list data
    void display() {
        Node head = this;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}

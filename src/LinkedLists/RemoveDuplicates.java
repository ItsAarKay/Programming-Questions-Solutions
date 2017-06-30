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

        myNode = removeDuplicates(myNode);

        myNode.display();
    }


    // remove duplicates from the linked list using hash table
    private static Node removeDuplicates(Node list) {
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
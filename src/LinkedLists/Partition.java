package LinkedLists;

/**
 * Created by AarKay on 01-Jul-17.
 * www.rakeshgautam.com
 * Write code to partition a linked list around a value p, such that
 * all nodes less than p come before all nodes greater than or equal to p.
 * (The partition element p can appear anywhere in the right partition.)
 */
public class Partition {
    public static void main(String[] args) {
        Node myNode = new Node(3);
        myNode.addNode(5);
        myNode.addNode(8);
        myNode.addNode(5);
        myNode.addNode(10);
        myNode.addNode(2);
        myNode.addNode(1);

        myNode = partition(myNode, 5);

        myNode.display();
    }

    // partition method
    private static Node partition(Node head, int p) {
        Node left = null;
        Node right = null;
        Node leftEnd = null; // to keep track of the left end of the list

        // iterate through the linked list
        while (head != null) {
            // if the node is less than the number add it on left side
            if (head.data < p) {
                if (left == null) {
                    left = new Node(head.data);
                    leftEnd = left;
                } else {
                    leftEnd = left.addNode(head.data);
                }
            } else {
                // if node is greater or equal than add on right
                if (right == null) {
                    right = new Node(head.data);
                } else {
                    right.addNode(head.data);
                }
            }
            head = head.next;
        }

        // if there was no node lesser than the specified number
        // set head as the right linked list
        if (left == null) {
            head = right;
        } else {
            // otherwise merge left and right part
            leftEnd.next = right;
            head = left;
        }
        return head;
    }
}

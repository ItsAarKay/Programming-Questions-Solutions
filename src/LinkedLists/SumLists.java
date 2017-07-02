package LinkedLists;

/**
 * Created by AarKay on 01-Jul-17.
 * www.rakeshgautam.com
 * You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored
 * in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list.
 */

public class SumLists {
    public static void main(String[] args) {
        Node n1 = new Node(9);
        n1.addNode(7);
        n1.addNode(8);

        Node n2 = new Node(6);
        n2.addNode(8);
        n2.addNode(5);

        sum(n1, n2).display();
    }

    // add two lists node by node
    private static Node sum(Node n1, Node n2) {
        Node head = null;
        int cary = 0;
        int sum;

        // add nodes from both list together and store carry
        while (n1 != null && n2 != null) {
            sum = n1.data + n2.data + cary;
            if (head == null) {
                head = new Node(sum % 10);
            } else {
                head.addNode(sum % 10);
            }
            cary = sum / 10;
            n1 = n1.next;
            n2 = n2.next;
        }

        // add the numbers to the result list if any left in any list
        while (n1 != null) {
            head.addNode(n1.data + cary);
            n1 = n1.next;
        }
        while (n2 != null) {
            head.addNode(n2.data + cary);
            n2 = n2.next;
        }
        // store the carry in the result list if not zero at last
        if (cary != 0) head.addNode(cary);

        return head;
    }
}

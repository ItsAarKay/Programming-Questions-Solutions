package LinkedLists;

/**
 * Created by AarKay on 30-Jun-17.
 * www.rakeshgautam.com
 * Implement an algorithm to find the Kth to last element in a singly linked list.
 */
public class KthToLast {
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

        Node ele = kthToLast(myNode, 5);
        if (ele != null) {
            System.out.println(ele.data);
        }
        else {
            System.out.println("Element doesn't exist!");
        }
    }

    private static Node kthToLast(Node head, int k) {
        Node p1 = head;
        Node p2 = head;

        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}

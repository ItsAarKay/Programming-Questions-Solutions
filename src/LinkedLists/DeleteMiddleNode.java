package LinkedLists;

/**
 * Created by AarKay on 30-Jun-17.
 * www.rakeshgautam.com
 * Implement an algorithm to delete a node in the middle (except last one)
 */
public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node myNode = new Node(0);
        myNode.addNode(8);
        myNode.addNode(2);
        myNode.addNode(3);
        myNode.addNode(6);
        myNode.addNode(1);
        myNode.addNode(9);
        myNode.addNode(5);

        Node middle = myNode.getNode(6);

        deleteMiddleNode(middle);
        myNode.display();
    }

    // delete any node from the middle
    private static void deleteMiddleNode(Node middle) {
        if (middle == null || middle.next == null) {
            System.out.println("Not a valid middle node");
        }
        else {
            middle.data = middle.next.data;
            middle.next = middle.next.next;
        }
    }
}

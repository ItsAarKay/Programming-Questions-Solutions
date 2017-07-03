package LinkedLists;

/**
 * Created by AarKay on 03-Jul-17.
 * www.rakeshgautam.com
 * Given two singly linked lists, determine if the two lists intersect(by reference). return the intersecting node.
 */
public class Intersection {
    public static void main(String[] args) {
        Node node1 = new Node(3);
        node1.addNode(1);
        node1.addNode(5);
        node1.addNode(9);

        Node node2 = new Node(4);
        node2.addNode(6);

        // add the intersection node
        node1.addNode(node2.addNode(7));

        node2.addNode(2);
        node1.addNode(1);

        // get the intersecting node
        Node n = isIntersection(node1, node2);
        if (n != null) {
            System.out.println("Intersection point: " + n.data);
        } else {
            System.out.println("No Intersection");
        }
    }

    // returns the intersection node or null
    private static Node isIntersection(Node node1, Node node2) {
        // calculate size of both lists
        int s1 = node1.size();
        int s2 = node2.size();

        // find which one is longer or shorter
        Node longer = (s1 > s2) ? node1 : node2;
        Node shorter = (s1 > s2) ? node2 : node1;

        int diff = longer.size() - shorter.size();

        // skip the longer list till the difference in size
        for (int i = 0; i < diff; i++) {
            longer = longer.next;
        }

        // match both lists one by one to check if any one node is same in both the lists
        while (longer != null && shorter != null) {
            if (longer == shorter) {
                // return any one longer or shorter
                return longer;
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }
}

package LinkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AarKay on 03-Jul-17.
 * www.rakeshgautam.com
 * Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
 */
public class LoopDetection {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.addNode(2);
        Node s = node1.addNode(3);
        node1.addNode(4);
        node1.addNode(5);
        node1.addNode(6);
        node1.addNode(7);
        //make a loop
        node1.addNode(s);

        Node loop = isLoopHash(node1);
        if (loop == null) {
            System.out.println("No Loop(SET)");
        } else {
            System.out.println("Loop Found(SET): " + loop.data);
        }

        Node loopRunner = isLoopRunner(node1);
        if (loopRunner == null) {
            System.out.println("No Loop(RUNNER)");
        } else {
            System.out.println("Loop Found(RUNNER): " + loopRunner.data);
        }
    }

    /*
    Method implemented using the SET collection in java.
    Returns the node if there is some loop otherwise null
     */
    private static Node isLoopHash(Node head) {
        Set<Node> set = new HashSet<>();

        while (head.next != null) {
            if (!set.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

    /*
    Same method implemented using the Runner approach on the linked list, using two pointers moving at different speeds.
     */
    private static Node isLoopRunner(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}

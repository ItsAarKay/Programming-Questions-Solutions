package LinkedLists;

import java.util.Stack;

/**
 * Created by AarKay on 02-Jul-17.
 * www.rakeshgautam.com
 * Implement a function to check if a linked list is a palindrome.
 * (if size of linked list is given)
 */
public class Palindrome {
    public static void main(String[] args) {
        Node myNode = new Node('a');
        myNode.addNode(9);
        myNode.addNode(2);
        myNode.addNode(1);
        myNode.addNode(2);
        myNode.addNode(9);
        myNode.addNode('a');

        int size = myNode.size();
        if (isPalindrome(myNode, size)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // return true if palindrome else false
    private static boolean isPalindrome(Node head, int size) {
        int i = 0;
        int mid = size / 2; // mid point
        boolean even = size % 2 == 0; // check if size even or not

        // use stack to store values
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            if (i < mid) {
                stack.push(head.data);
            } else if (i > mid || (even && i == mid)) {
                /*
                if the size of linked list is even than start checking from the mid value
                but if size is odd than skip the mid value
                 */
                if (stack.pop() != head.data) {
                    return false;
                }
            }
            head = head.next;
            i++;
        }
        return true;
    }
}

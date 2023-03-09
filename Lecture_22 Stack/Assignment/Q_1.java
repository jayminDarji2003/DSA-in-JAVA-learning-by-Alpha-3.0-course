
/*
    Q.1:- Palindrome Linked List
    Time Complexity = O(n)
    Space Complexity = O(n)
    
*/
import java.util.*;

public class Q_1 {
    // creating node
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Palindrome fnx
    static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean isPalin = true;
        Stack<Integer> s = new Stack<>();

        while (slow != null) {
            s.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                isPalin = true;
            } else {
                isPalin = false;
                break;
            }

            head = head.next;
        }

        return isPalin;
    }

    public static void main(String[] args) {
        Q_1 ll = new Q_1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        boolean condition = isPalindrome(head);
        System.out.println("Palindrome : " + condition);
    }

}

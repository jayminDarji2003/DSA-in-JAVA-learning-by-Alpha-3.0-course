// Detecting cycle in Linked List
public class RemoveCycleLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Detecting cycle in LL function
    // Floyd's cycle find algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exits
            }
        }

        return false; // cycle doesn't exits
    }

    // Remove cycle function
    public static void removeCycle() {
        // cycle detect
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;   // stored last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle --> prev.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // LL 1->2->3->2

        System.out.println(isCycle()); // checking cycle exits or not
        removeCycle();
        System.out.println(isCycle()); // After removing cycle check cycle exits or not
    }
}
public class Head_Tail {
    // making Node class (blue print)
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // creating Head and Tail
    // Head and Tail is Property of LinkedList so declare it on linkedlist class
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        // Head_Tail ll = new Head_Tail();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
    }
}

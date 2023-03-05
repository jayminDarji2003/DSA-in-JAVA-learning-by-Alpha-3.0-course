// Add First --> Linked List

public class AddFirst {
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

    
    // Add first node
    // steps
    // 1. create new node
    // 2. newNode.next = head
    // 3. head = newNode

    // Add first Node
    public void addFirst(int data) {
        // step 1 -> create new node
        Node newNode = new Node(data);

        // if we don't have any node in LinkeList
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 -> newNode next = head
        newNode.next = head; // linked newNode to head

        // step 3 head = newNode
        head = newNode;
    }

    public static void main(String[] args) {
        AddFirst ll = new AddFirst();

        ll.addFirst(1);
        ll.addFirst(2);
    }
}

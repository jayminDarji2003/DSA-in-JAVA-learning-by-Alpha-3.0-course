    // Adding element last in LinkedList

public class AddLast {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data){
        // step 1 : create new node
        Node newNode = new Node(data);

        // when linkedList is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 : tail.next = newNode
        tail.next = newNode;

        // step 3 : tail = newNode
        tail = newNode;
    }


    // Add first Node
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }



    public static void main(String[] args) {
        AddLast ll = new AddLast();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);
    }
}

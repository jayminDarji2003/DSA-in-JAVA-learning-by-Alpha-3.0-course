// Find and Remove Nth node from end. using Iterative approach
public class DeleteNthNode {

    // Creating node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // creating head and tail
    public static Node head;
    public static Node tail;
    public static int size;

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print Linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete Nth node from end function
    public void deleteNthFromEnd(int n) {
        // calulate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) { // last thi "n" == head(sz)
            // to remove head
            head = head.next; // removeFirst
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;

        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        DeleteNthNode ll = new DeleteNthNode();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
    }
}

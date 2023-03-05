// search key in Linked list --> Recursive 
public class SearchInLL2 {
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

    // search for key (Recursive)

    public int helper(Node head, int key) { // TC = O(n) and SC = O(n)
        // base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int Search(int key) { // O(n)
        return helper(head, key);
    }

    public static void main(String[] args) {
        SearchInLL ll = new SearchInLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        System.out.println(ll.Search(3));
        System.out.println(ll.Search(10));

    }
}

// Remove last in linked list  
public class SearchInLL {
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


    // search for key
    public int Search(int key) {    // O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
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

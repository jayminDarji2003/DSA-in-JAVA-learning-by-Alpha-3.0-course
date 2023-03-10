/*  
    #Microsoft
    Q.1 :- Queue using Linked List.
*/

public class Q_1_LinkedList_queue {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head = null;
        static Node tail = null;

        // isEmpty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!!");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty() ) {
                 System.out.println("Queue is empty!!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

            System.out.println(q.peek());
            q.remove();
        }
    }

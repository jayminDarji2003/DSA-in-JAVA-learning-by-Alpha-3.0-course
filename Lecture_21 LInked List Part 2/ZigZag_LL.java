/*  
    To create zig-zag Linked list from simple linked list

    Simple LL => L(1)->L(2)->L(3)->L(4)->L(5)->L(6)........L(n-1)->L(n)
    zig-zag LL => L(1)->L(n-1)->L(2)->L(n-2)->L(3)->L(n-3).....Till end of left and right Linked List

    ex:-
        SL : 1-2-3-4-5-6->null
        Zig-Zag : 1-6-2-5-3-4->null

    Convert Simple LL to Zig-Zag LL
    steps:-
        1. Find mid (mid should be 1st half Last Node)
        2. Reverse 2nd half (After reverse we see to parts of simple LL )
        3. Alternate merging


        2-> reverse logic
            3 variable
            4 steps
*/
public class ZigZag_LL {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
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


    // Zig-Zag function
    public void zigZag(){
        //Find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Reverse 2nd half
        Node curr = mid.next; // 1st variable
        mid.next = null;
        
        Node prev = null; // 2nd variable
        Node next; //3rd variable

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftH = head;
        Node rightH = prev;
        Node nextL, nextR; 

        //Alt merge - zig-zag merge
        while(leftH != null && rightH != null){
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            leftH = nextL;
            rightH = nextR;
        }
    }

    public static void main(String[] args) {
        ZigZag_LL ll = new ZigZag_LL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // 1->2->3->4->5

        ll.print();
        ll.zigZag();
        ll.print();
    }
}

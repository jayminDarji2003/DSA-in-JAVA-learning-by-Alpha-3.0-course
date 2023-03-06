    // Java collection framwork in Linked List
import java.util.LinkedList;

public class JCF_LL {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        //Add data
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);

        // print ll
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}

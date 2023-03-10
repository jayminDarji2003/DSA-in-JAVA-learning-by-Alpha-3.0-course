/*
    Q.7 :- Deque (Double ended queue)

    Methods
        1.addFirst()
        2.addLast()
        3.removeFirst()
        4.removeLast()
        5.getFirst()
        6.getLast()
        
*/

import java.util.*;

public class Question_7 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);  // addFirst method
        dq.addLast(2);   // addLast method
        dq.addLast(3);
        dq.addLast(4);

        dq.removeFirst();
        dq.removeFirst();

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}

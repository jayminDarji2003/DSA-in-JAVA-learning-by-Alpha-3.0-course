/*
    Implement Priority Queue using JCF. 
        JCF = Java Collection Framwork.

    There are three function in Priority Queue.
        1. add() --> O(log n)
        2. remove() --> O(log n)
        3. peek() --> O(1)
*/

// import java.util.Comparator;  // used when we use comparator interface
import java.util.PriorityQueue; // importing priority queue class

public class priorityQueueImplement {
    public static void main(String[] args) {
        // by default, In Priority Queue -> remove element ascending order
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // to remove discending order then we have to pass parameter as follows.
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // adding element to priority queue
        pq.add(3);   // O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        // remove element from priority queue
        // element will be removed ascending order
        while(!pq.isEmpty()){
            System.out.print(pq.peek() + "  ");  // O(1)
            pq.remove(); //O(log n)
        }
    }
}
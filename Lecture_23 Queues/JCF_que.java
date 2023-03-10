/*
    Implement Queue using JCF(java collection fromwork)

    Queue<Integer> q = new LinkedList<>();
    Queue -->Interface --> we can't make object of interface
        so, to implement Queue we use LinkedList class.
        we have two class to implement Queue
            1. LinkedList
            2. ArrayDeque
 */
import java.util.*;

public class JCF_que {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();  // ArrayDeque
        Queue<Integer> q = new ArrayDeque<>(); 
        q.add(1);
        q.add(2);
        q.add(3);


        System.out.println("Removed front is : " + q.remove());
        q.add(4);
        System.out.println("Removed front is : " + q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

/*
    Q.6 :- Reversal of Queue
*/
import java.util.*;

public class Question_6 {
    public static void reversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reversal(q);

        // print
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
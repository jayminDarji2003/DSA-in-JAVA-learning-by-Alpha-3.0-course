/*
    Q.9 :- Queue using Deque
        here we are using 
            addLast()
            removeFirst()
            getFirst()
*/
import java.util.*;

public class Question_9 {
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        // add
        public void add(int data){
            dq.addLast(data);
        }

        // remove
        public int remove(){
            return dq.removeLast();
        }

        // peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Remove = " + q.remove());
        System.out.println("Peek = " + q.peek());
    }
}

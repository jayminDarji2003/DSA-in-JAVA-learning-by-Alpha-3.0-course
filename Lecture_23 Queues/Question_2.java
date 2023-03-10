/*
    Q.2 :- Implement Queue using --> 2 stacks

    add steps
        1.if--> khali --> add
        2.if --> Not khali --> all ele transfer to stack2
        3.stack2 --> ele add --> stack1
*/
import java.util.*;

public class Question_2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public void add(int data) {  //O(n)
            // step 1
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // step 2
            s1.push(data);

            // step 3
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        // remove
        public int remove(){ //O(1)
            if(isEmpty()){
                System.out.println("Queue is empty!!!");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public int peek(){  //O(1)
            if(isEmpty()){
                System.out.println("Queue is empty!!!");
                return -1;
            }
            return s1.peek();   
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }   
}

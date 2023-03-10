/**
  Question_8 :-  Stack using Deque
    here we are using just theree methods.
        addLast()
        removeLast()
        getLast()
*/
import java.util.*;

public class Question_8 {
    static class Stack{
        Deque<Integer> dq = new LinkedList<>();

        //push
        public void push(int data){
            dq.addLast(data);
        }

        // pop
        public int pop(){
            return dq.removeLast();
        }

        // peek
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Poped ele : " + s.pop());
        System.out.println("Peeked ele : " + s.peek());
    }
}
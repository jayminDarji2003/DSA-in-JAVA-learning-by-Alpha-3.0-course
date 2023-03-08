/* 
        Q.3 :- Reverse a stack

        Approach :
            1.pop ele
            2.insert at bottom (push at bottom)
*/
import java.util.*;

public class Question_3 {

    public static void pushAtBottom(Stack<Integer> s, int data){
        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // kaam
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s){
        while(! s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer> s){
        // base case
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // printStack(s);
        reverseStack(s);
        printStack(s);
    }
}

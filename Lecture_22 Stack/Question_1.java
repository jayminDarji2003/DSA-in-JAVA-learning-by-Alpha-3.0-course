/* Q.1 :- Push at the Bottom of the stack
        -> To solve we use --> Recursion

        steps
            1. remove ("uper java java in implicit staci")
            2. add ("add karo baki vadhela element")
*/

import java.util.*;

public class Question_1 {

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

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4); // (stack, element)
        
        // print Stack
        while(! s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}

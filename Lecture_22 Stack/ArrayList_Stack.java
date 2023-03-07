import java.util.ArrayList;

/*
    Implementation of statck
        3 ways
            1.using Array
            2.using ArrayList
            3.using Linked List
 */

public class ArrayList_Stack {
    // Implementation stack using ArrayList
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        
        // isEmpty fnx
        public boolean isEmpty(){
            return list.size() == 0;
        }

        // push fnx
        public void push(int data){
            list.add(data);
        }

        // pop fnx
        public int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek fnx
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return list.get(list.size() - 1);
        }
    }   


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
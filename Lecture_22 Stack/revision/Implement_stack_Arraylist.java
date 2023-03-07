package revision;

import java.util.ArrayList;

public class Implement_stack_Arraylist {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        // isEmpty
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
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
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}

/*
    Circular queue is Implementation using Array
 */

public class Circular_que {
    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return ((rear == -1) && (front == -1));
        }

        // isFull
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {  // O(1)
            if (isFull()) {
                System.out.println("Queue is full!!!");
                return;
            }

            // when we add first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public int remove() {  //O(1)
            if (isEmpty()) {
                System.out.println("Queue is empty!!");
                return -1;
            }
            int frontVal = arr[front];
            // last el delete 
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1) % size;
            }
            return frontVal;
        }


        // peek
        public int peek(){  //O(1)
            if(isEmpty()){
                System.out.println("Queue is empty!!!");
                return -1;
            }
            return arr[front];  
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
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

/*
    Heep Peek :- Get the min element in Heap.The min element in Heap is root.
*/

import java.util.ArrayList;

public class Heap_peek{
    // creating Heap class
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

         // add fnx
        public void add(int data){   // O(log n)
            // add at last index
            arr.add(data);

            // find parent index 
            int x = arr.size()-1;  // x is child idx
            int par = (x-1)/2;  // cal parent idx

            while(arr.get(x) < arr.get(par)){   // O(log n)
                // swap 
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }


        // peek fnx
        public int peek(){
            return arr.get(0);
        }

        
        // print heap
        public void print(){
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap();
        
        // insert value in heap 
        hp.add(1);
        hp.add(4);
        hp.add(7);
        hp.add(3);

        // print the heap
        System.out.println("-> Printing the heap element");
        hp.print();

        // peek in Heap : min ele in heap
        System.out.println("-> Min element in the heap is : " + hp.peek());
    }
}

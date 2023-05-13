/*
    Heap :-
        There are two types of Heap.
            1. Min Heap  --> value of child is high then parent (child > parent)
            2. Max Heap  --> value of parent is high then child (parent > child)
        
    Formula we must know
        1. when we have child node index and we want to find parent node index then use :-
            formula = (x - 1) / 2  , x=child index

        2. When we have parent node index and we want to find child node index then use :-
            left child = 2x + 1   , x = index of parent node.
            right child = 2x + 2  , x = index of parent node.
*/

import java.util.ArrayList;

public class Heap_Insert {
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


        // print Heap 
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
        hp.print();
    }
}

/*
    Remove in Heap

    -> Remove in heap is a three step process.
        1. Swap 1st and last Node.
        2. Remove last Node.  --> arr.remove(arr.size()-1)
        3. Fix Heap --> call --> Heapify fnx

    -> Heapity fnx   TC = O(logn)
        root = i
        left = 2i+1
        right = 2i+2
        min = (i,2i+1,2i+2)
        min swap with root --> swap(min,root)
*/

import java.util.ArrayList;

public class Heap_Remove {
    // Heap class
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        // add fnx
        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1) / 2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        // print heap
        public void print(){
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }

        // peek fnx
        public int peek(){
            return arr.get(0);
        }


        // heapify fnx
        private void heapify(int i){   // i = root idx
            int left = 2*i+1;      // left idx
            int right = 2*i+2;      // right idx

            int minIdx = i; // root

            // check for left
            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            // check for right
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        } 

        // remove in Heap fnx
        public int remove(){
            int data = arr.get(0);

            // step1 - swap first and last.
            int temp = arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size()-1,temp);

            // step2 - delete last
            arr.remove(arr.size()-1);

            // step3 - heapify call
            heapify(0);

            return data;
        }
    }

    public static void main(String[] args) {
        Heap hp = new Heap();

        hp.add(9);
        hp.add(7);
        hp.add(5);
        hp.add(4);

        System.out.println("Before");
        hp.print();

        System.out.println(hp.remove());

        System.out.println("After");
        hp.print();
    }
}

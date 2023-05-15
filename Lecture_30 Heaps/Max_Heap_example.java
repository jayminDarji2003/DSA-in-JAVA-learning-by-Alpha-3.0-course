/*
    Max Heap example :-
*/

import java.util.ArrayList;

public class Max_Heap_example {
    // Heap class
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        // add Heap
        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int par = (x-1) / 2;

            while(arr.get(x) > arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        // peek Heap
        public int peek(){
            return arr.get(0);
        }
        // heapify (healper fnx for remove)
        private void heapify(int i){
            int left = i*2+1;
            int right = i*2+2;
            int maxIdx = i;

            if(left < arr.size() && arr.get(maxIdx) < arr.get(left)){
                maxIdx = left;
            }

            if(right < arr.size() && arr.get(maxIdx) < arr.get(right)){
                maxIdx = right;
            }

            if(maxIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i,arr.get(maxIdx));
                arr.set(maxIdx,temp);

                heapify(maxIdx);  // recursive call
            }
        }

        // remove heap
        public int remove(){
            int data = arr.get(0);  // get root

            // step 1 : 1st and last ele swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // step 2 : last ele remove from heap
            arr.remove(arr.size()-1);

            // step 3 : call heapity
            heapify(0);

            return data;
        }

        // isEmpty fnx
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        // print heap
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}

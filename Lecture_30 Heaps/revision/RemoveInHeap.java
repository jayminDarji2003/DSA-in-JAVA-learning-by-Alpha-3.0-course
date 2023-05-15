package revision;
/*
    Remove in Heap
*/

import java.util.ArrayList;

public class RemoveInHeap {
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

                x = par;
                par = (x-1)/2;
            }
        }

        // peek fnx
        public int peek(){
            return arr.get(0);
        }
        
        // heapify fnx
        private void heapify(int i){
            int left = i*2+1;
            int right = i*2+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);  // recursive call
            }
        }

        // Re Write fnx
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

        // is empty fnx
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

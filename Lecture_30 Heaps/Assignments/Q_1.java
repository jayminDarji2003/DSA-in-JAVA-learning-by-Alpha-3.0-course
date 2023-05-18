/*
    Q.1 :- Find Kth largest element in a stream.

    we have an infinite stream of integer , find kth largest element at any point of time.

    ex. 
        stream[] = {10,20,11,70,50,40,100,5,...}
        output : {_,_,10,11,20,40,50,50,...}

    Time Complexity : O(log k)
    Space Complexity : O(1)
*/
import java.util.*;

public class Q_1 {
    static PriorityQueue<Integer> min;
    static int k;

    static List<Integer> getAllKthNumber(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int val : arr) {
            if (min.size() < k) {
                min.add(val);
            } else {
                if (val > min.peek()) {
                    min.poll();
                    min.add(val);
                }
            }

            if (min.size() >= k) {
                list.add(min.peek());
            } else {
                list.add(-1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        min = new PriorityQueue<>();
        k = 4;
        
        int arr[] = {1,2,3,4,5,6};
        List<Integer> res = getAllKthNumber(arr);
        for(int x : res)
            System.out.println(x + " ");
    }
}
/*
    Q.4 :- Largest SubArray with 0 sum.
*/

import java.util.HashMap;

public class Q_4 {
    public static void main(String[] args) {   // O(n)
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum,idx) --> pair will be store in map.

        int sum = 0;
        int len = 0;

        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));  // max(len,j-i)
            }else{
                map.put(sum, j);
            }
        }

        System.out.println("Largest subarray with sum as 0 => " + len);
    }
}

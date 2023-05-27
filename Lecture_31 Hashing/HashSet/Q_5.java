/*
    Q.5 :- Sub array sum equal to K.
*/

import java.util.HashMap;

public class Q_5 {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        HashMap<Integer,Integer> map = new HashMap<>();
        // sum,count --> pairs
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for(int j=0; j<arr.length; j++){   // O(n)
            sum += arr[j];

            if(map.containsKey(sum - k)){
                ans += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }


        System.out.println("Ans = " + ans);
    }
}

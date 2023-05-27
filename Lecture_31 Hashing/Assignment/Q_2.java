/*
    Q.3 : Two sum
*/

import java.util.HashMap;
import java.util.Map;

public class Q_2 {
    public static int[] twoSum(int[] arr,int target){
        Map<Integer,Integer> visited = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];

            // check if found difference is present int the MAP list.
            if(visited.containsKey(diff)){
                return new int[] {i,visited.get(diff)};
            }

            // add arr element in the MAP to match with future element if forms a pair
            visited.put(arr[i], i);
        }


        // if no match are found
        return new int[] {0,0};
    }


    public static void main(String[] args) {
        int arr[] = {2,7,11,15,1};
        int target = 16;

        int res[] = twoSum(arr, target);
        System.out.println("[" + res[0] + " , " + res[1] + "]");
    }
}

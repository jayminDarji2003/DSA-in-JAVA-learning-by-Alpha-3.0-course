
/*
    Q.1 :- Majority elements.
        -> Given an integer array of size n, find all elements tht appear  more than [n/3] times.
*/
import java.util.*;

public class Q_1 {
    // fnx that print majority elements.
    // way 1
    public static void printMajorityEle1(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Set<Integer> keys = map.keySet();
        int n = arr.length;

        for (Integer key : keys) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }


    // way 2
    public static void printMajorityEle2(int arr[]){
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map2.put(arr[i], map2.getOrDefault(arr[i], 0) + 1);
                // getOrDefault fnx return
                    // if key exits ----> return key value
                    // else ------------> return default value
        }

        for(Integer key : map2.keySet()){  // here we can't store keys but directly use in foreach loop
            if(map2.get(key) > arr.length/3){
                System.out.println(key);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        System.out.println("Way 1 : Brute force");
        printMajorityEle1(arr);

        System.out.println("Way 2 : Optimize way");
        printMajorityEle2(arr);
    }
}

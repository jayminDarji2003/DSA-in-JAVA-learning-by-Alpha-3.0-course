/*
    Iteration on HashMap :- means Loops.
    
    To Iterate we use:
        Set<Integer> keys = hm.keySet();
            -> Set is a Data Structure.
            -> keys stores all keys of HashMap hm.

        after that use forEach loop to print or access data.

*/
import java.util.*;

public class Iteration_HashMap {
    public static void main(String[] args) {
        // CREATE HASHMAP
        HashMap<String,Integer> hm = new HashMap<>();

        // INSERT VALUE TO HASHMAP
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US",50);
        hm.put("Nepal",6);
        hm.put("Bhutan",4);

        // ITERATE ON HASHMAP
        Set<String> keys = hm.keySet();

        // PRINTING THAT KEYS
        System.out.println(keys);

        // FOREACH LOOP
        for(String k : keys){
            System.out.println("key = " + k + ", values = " + hm.get(k));
        }


        // entrySet() fnx return keys and value both
        System.out.println(hm.entrySet());

    }
}
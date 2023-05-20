/*
    TreeMap :- Keys are Sorted.

    -> Keys are sorted in Map that why
            --> TC = O(log n)
                put()
                remove()
                get()
        
    --> Note:- TreeMap use RED BLACK TREE to IMPLEMENT.
*/
import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        // CREATE
        TreeMap<String,Integer> tm = new TreeMap<>();
        // TreeMap<String,Integer> tm = new TreeMap();

        // ADD
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Nepal",50);
        tm.put("US",50);

        // get
        System.out.println(tm.get("India"));

        // remove
        System.out.println(tm.remove("US"));

        // isEmpty
        System.out.println(tm.isEmpty());

        // keySet
        System.out.println(tm.keySet());

        System.out.println(tm);
    }
}

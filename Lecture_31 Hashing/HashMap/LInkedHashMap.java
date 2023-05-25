/*
    LinkedHashMap :-
        Property:- Keys are insertion ordered.

        - All function are same as HashMap.
        - with O(1) TC
            1. put()
            2. get()
            3. remove()
            4. containsKey()
            5. isEmpty()
            6. size()
*/
// import java.util.LinkedHashMap;
import java.util.*;

public class LInkedHashMap {
    public static void main(String[] args) {
        // CREATE
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // INSERT DATA
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        // PRINT LHM
        System.out.println(lhm);

        // get fnx
        System.out.println(lhm.get("India"));

        // remove
        lhm.remove("China");

        // keySet
        System.out.println(lhm.keySet());

        // isEmpty
        System.out.println(lhm.isEmpty());

        // size
        System.out.println(lhm.size());

        // PRINT LHM
        System.out.println(lhm);
    }
}

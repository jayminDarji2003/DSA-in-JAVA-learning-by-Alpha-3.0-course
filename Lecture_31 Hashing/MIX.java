import java.util.Set;
import java.util.HashMap;

public class MIX {
    public static void main(String[] args) {
        /*
            HashMap :-
                1. Map (HashMap, linkedHashMap, TreeMap)
                2. Set (HashSet, linkedHashSet, TreeSet)
        */

        // create
        HashMap<String,Integer> hm = new HashMap<>();

        // insert data
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        // print
        System.out.println(hm);

        // get data
        System.out.println(hm.get("Nepal"));

        // contains key
        System.out.println(hm.containsKey("India"));

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // Iterate
        Set<String> keys = hm.keySet();
            // loop
        for(String k : keys){
            System.out.println("Key = " + k + " value = " + hm.get(k));
        }

        // empty set fnx
        System.out.println(hm.entrySet());
    }
}

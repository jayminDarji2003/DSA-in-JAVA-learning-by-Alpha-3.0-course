/*
    Q.3 :- Find Itinerary from Tickets.

    TC : O(n) ---> using HashMap.
*/
import java.util.*;

public class Q_3 {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        // find start 
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; // start point
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // start
        String start = getStart(tickets);

        System.out.print(start); // Mumbai

        for(String key : tickets.keySet()){
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}

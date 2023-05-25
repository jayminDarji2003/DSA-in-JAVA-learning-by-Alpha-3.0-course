/*
    LinkedHashSet :-
        Ordered using DLL.(doubly linked list).

        Performance :-
            LHM < HM --> LHM = LinkedHashMap, HM = HashMap.
            LHS < HS --> LHS = LinkedHashSet , HS = HashSet.

        Note:- All operation can do using all function of HashSet.
*/
import java.util.*;

public class LinkedHashSetImple {
    public static void main(String[] args) {
        // CREATE
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // ADD
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        // PRINT
        System.out.println(lhs);

        // REMOVE
        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
/*
    Iteration HashSet :-
        There are 2 way to Iterate on HashSet.
            A. Using Iterators  --> here we are use Iterator interface
            B. Using for loop
*/
import java.util.*;

public class Iteration_HashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        // add
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");


        // A. using iterator interface
        Iterator it = cities.iterator();
        System.out.println("Traverse using Iterator interface");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        // B. using advanced loop
        System.out.println("Traverse using advanced loop");
        for(String city : cities){
            System.out.println(city);
        }
    }
}

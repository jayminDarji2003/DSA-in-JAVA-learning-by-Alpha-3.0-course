/*
    HashSet Operations :-
        There are 3 operation on HashSet.
            1. add(key)
            2. contains(key)
            3. remove(key)
            4. size()
            5. clear()
            6. isEmpty()
    
    Note :- 
        HashSet implements ----> HashMap.
        LinkedHashSet implements ----> LinkedHashMap.
        TreeSet implements ----> TreeMap.
*/
import java.util.HashSet;

public class operation_HashSet{
    public static void main(String[] args) {
        // CREATE
        HashSet<Integer> set = new HashSet<>();

        // ADD
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2); // will not add
        set.add(1); // will not add

        // PRINT
        System.out.println(set);

        // CONTAINS
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }else{
            System.out.println("Set can't contains 2");
        }

        // REMOVE
        set.remove(2);

        // CONTAINS
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }else{
            System.out.println("Set can't contains 2");
        }


        // SIZE
        System.out.println("The size of Set is : " + set.size());

        // PRINT
        System.out.println(set);

        // CLEAR
        set.clear();

        // PRINT
        System.out.println(set);

        // isEmpty
        System.out.println(set.isEmpty());

    }
}
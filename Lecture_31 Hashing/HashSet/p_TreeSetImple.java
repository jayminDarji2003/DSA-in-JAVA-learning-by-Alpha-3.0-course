/*
    TreeSet :- 
        -> Sorted in ascending order.
        -> NULL value are NOT allowed.

        Implementation :-
            TreeSet ----> TreeMap ----> RedBlackTree.

*/
import java.util.*;

public class p_TreeSetImple {
    public static void main(String[] args) {
        // CRATE
        TreeSet<Integer> ts = new TreeSet<>();

        // ADD
        ts.add(6);
        ts.add(9);
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(10);

        // PRINT
        System.out.println(ts);

    }
}

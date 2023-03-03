import java.util.ArrayList;

/*
    ArrayList Operations:- 
        1. add element  -> O(1)
        2. get element  -> O(1)
        3. remove element   -> O(n)
        4. set element at index  -> O(n)
        5. contains   -> O(n)
 */

public class Operations {
    public static void main(String[] args) {
        // 1.add element
        ArrayList<Integer> list = new ArrayList<>();
        // adding value to ArrayList
        list.add(1);  // TC = O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9);  // adding eles at index 1 and TC=O(n)

        System.out.println(list); // print list

        // 2.get element
        // int element = list.get(2);  // get will return element
        // System.out.println(element);

        // 3. remove element
        // list.remove(1);
        // System.out.println(list);

        //4. set at index
        // list.set(2,10);
        // System.out.println(list);

        // 5.contains element :- element has in ArrayList or not if has then return true else return false  
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

    }
}

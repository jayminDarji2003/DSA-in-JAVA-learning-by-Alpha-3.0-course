import java.util.*;

// Multi-dimensional array list
public class MultiDimensionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(12);
        mainList.add(l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        mainList.add(l2);

        // print main list element
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
            System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}

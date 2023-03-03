import java.util.*;

// Q. To store and print 2D ArrayList 
/*
        list1 = 1 2 3 4 5
        list2 = 2 4 6 8 10
        list3 = 3 6 9 12 15
 */
public class Q1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // adding elements to above list
        for(int i=1; i<=5; i++){
            list1.add(i*1);     //1 2 3 4 5 
            list2.add(i*2);     //2 4 6 8 10
            list3.add(i*3);     //3 6 9 12 15
        }
        
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // simple way to print ArrayList
        System.out.println(mainList);

        // print ArrayList using nested loops
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}

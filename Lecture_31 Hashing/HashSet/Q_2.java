/*
    Q.2 :- Union and Intersection of 2 Arrays.
*/
import java.util.*;

import javax.swing.text.AbstractDocument.Content;

public class Q_2 {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        
        HashSet<Integer> set = new HashSet<>();

        // union
        
        System.out.println("--------- Union -----------");
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("Union : " + set.size());
        // print ele
        for(Integer ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();


        // Intersection

        set.clear();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int count = 0;

        System.out.println("--------- Intersection -----------");
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }

        System.out.println("\nIntersection = " + count);

    }
}

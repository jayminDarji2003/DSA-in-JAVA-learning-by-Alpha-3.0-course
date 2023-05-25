/*
    Q.1 :- Count Distinct Elements
        Means count Unique element in array.

    Brute force approach 
        for(i = 0 to arr.length)
            for(i = 0 to temp.length)
                check element
                if(not consist by temp array)  -----> add
                else ---> not add


    Optimized approach using HashSet.

*/
import java.util.*;

public class Q_1 {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){  // O(n)
            set.add(nums[i]);
        }

        System.out.println("Distinct elements is = " + set.size());
    }
}

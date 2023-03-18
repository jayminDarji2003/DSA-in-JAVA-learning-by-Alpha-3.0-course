
/*
    Q.3 :- Min Absolute Difference Pairs

    step 
        1.sort both array
        2. make pair
        3. sum of pair
*/
import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        int A[] = { 1, 4, 7, 8 };
        int B[] = { 2, 3, 5, 6 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Absolute Difference Pairs = " + minDiff);
    }
}

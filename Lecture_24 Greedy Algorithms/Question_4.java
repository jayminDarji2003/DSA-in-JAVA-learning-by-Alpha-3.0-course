/*
    Q.4 :- Max length Chain of Pairs
*/
import java.util.*;

public class Question_4 {
    public static void main(String[] args) {  // O(nlogn)
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // step 1 :- sort pairs
        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));
        int chainLen = 0;

        // 1st pair selected
        chainLen = 1;
        int chainEnd = pairs[0][1]; // last selected pair end

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("chain length is : " + chainLen);
    }
}

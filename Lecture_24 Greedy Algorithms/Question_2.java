/*
    Q.2:- Fractional knapsack
*/
import java.util.*;

public class Question_2 {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];  // created 2D array
        //0th col => index; 1st col => ratio;

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }

        // lambda function
        // ascending order sort
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));  // sort basis on 1 col


        int capacity = w;
        int finalVal = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]){  // include full weight
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                // add fractional items
                finalVal += ratio[i][1] * capacity; 
                capacity = 0;
                break;
            }
        }

        System.out.println("final val = " + finalVal);
    }
}

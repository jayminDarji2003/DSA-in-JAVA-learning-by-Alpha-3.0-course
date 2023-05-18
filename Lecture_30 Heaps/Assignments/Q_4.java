/*
    Q.4 :- Minimum operation to halve Array sum.

    PRIORITY QUEUE IS LIKE A SIMPLE QUEUE BUT THE DATA IN IT IS AUTOMATICALLY SORTED IN ASCENDING ORDER. I HAVE USED reverseOrder FUNCTION TO MAKE IT IN DESCENDING ORDER AS PER NEED OF THE QUESTION USE DOUBLE BECAUSE PROBLEM STATES DECIMALS WHEN SUMMING.THESE VALUES CAN BE LOST IF WE USE INT DATATYPE. 
    
    In this we basically store our array in priority queue and our sum in our double variable.
    Then we poll the largest element from our priority queue and remove it from the sum, half it and add it back to check whether the difference bw original sum and this new sum is at least half of the initial sum.We update our result(r) variable and return it.
*/
import java.util.*;

public class Q_4 {
    public static int countMinOpe(int[] arr){
        double sum = 0.00;
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i<arr.length; i++){
            sum += (double) arr[i];
            pq.add((double) arr[i]);
        }

        double target = sum / 2;
        int op = 0;

        while(sum > target){
            op++;
            double curr = pq.poll();
            sum -= curr;
            curr = curr / 2;
            pq.add(curr);
            sum += curr;
        }

        return op;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,8,19};
        int noOfOp = countMinOpe(arr);
        System.out.println("The minimum operation to halve Array is : " + noOfOp);
    }
}

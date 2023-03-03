/*
    Q. Print sum of N natural numbers
 */

public class Question_4 {
    public static int printSum(int n){
        // base case
        if(n == 1){
            return 1;
        } 
        int nm1 = printSum(n-1);
        int sum = n + nm1;
        return sum;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(printSum(n));
    }
}

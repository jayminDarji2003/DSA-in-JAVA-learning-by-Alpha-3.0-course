/*
    Q. Print 1 to N in increasing order.
 */

public class Question_2 {
    public static void printInc(int n){
        // base case
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        // call itself
        printInc(n-1);
        
        // do work
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n=10;
        printInc(n);
    }
}

/* 
    Q. Print numbers from N TO 1 in decreasing order. using recursion.
*/

public class Question_1 {
    public static void printDec(int n){
        // base case. When our recursive function end.
        if(n == 1){
            System.out.print(n);
            return;
        }

        // do work
        System.out.print(n + " ");

        // call it self
        printDec(n - 1);
    }

    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}

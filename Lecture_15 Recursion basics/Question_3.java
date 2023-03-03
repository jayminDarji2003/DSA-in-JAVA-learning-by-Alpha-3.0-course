/* 
    Q. Print factorial of number n.
*/

public class Question_3 {
        // approch 1
    public static int fact(int n){
        // base case
        if(n==0){
            return 1;
        }

        // call itself
        return n * fact(n-1);
    }

        // approch 2
    public static int fact2(int n){
        // base case
        if(n==0){
            return 1;
        }

        int nm1 = fact(n-1);
        int factorial = n * nm1;
        
        return factorial;
    }
    public static void main(String[] args) {
        int n=5;

        // using first approch
        int factorial = fact(n);
        System.out.println(factorial);

        // using second approch
        int factorial2 = fact2(n);
        System.out.println(factorial2);
    }
}

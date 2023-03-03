/*
    Q. Print x^n.
 */

public class Question_9 {
    // first approach
    public static int power(int x,int n){
        // base case
        if(n == 0){
            return 1;
        }

        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    // second approach
    public static int power2(int x,int n){
        // base case
        if(n == 0)
            return 1;
        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(power2(2, 10));
    }
}

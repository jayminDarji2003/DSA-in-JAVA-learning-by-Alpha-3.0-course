/*
    Fibonacci series :-
        -> using recursion approach
*/

public class fibb {
    public static int fib(int n, int[] f) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        if(f[n] != 0){ // fib(n) -- calculated
            return f[n];
        }

        f[n] =  fib(n - 1,f) + fib(n - 2,f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n+1];  // store 0 at every index
        System.out.println(fib(n,f));
    }
}
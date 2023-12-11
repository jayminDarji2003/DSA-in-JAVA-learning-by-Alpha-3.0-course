/*
    Fibonacci number :-
        -> To find fibonacci number, we have three ways
            1. recursion way
            2. DP way
                i. Memoization way
                ii. Tabulation way
*/

public class fibb {
    // calculating fibonacci using recursion approach
    public static int recursionWay(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        return recursionWay(n - 1) + recursionWay(n - 2);
    }

    // calculating fibonacci using Memoization approach
    public static int memoizationWay(int n, int[] f) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        if (f[n] != 0) { // fib(n) is already calculated
            return f[n];
        }

        f[n] = memoizationWay(n - 1, f) + memoizationWay(n - 2, f);
        return f[n];
    }

    // calculating fibonacci using Tabulation approach
    public static int tabulationWay(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Recursion way = " + recursionWay(n));

        int f[] = new int[n + 1]; // why we take one more space because we want to store fib(n) value to the
        // array. And also it stores 0 at every index.
        System.out.println("Memoization way = " + memoizationWay(n, f));

        System.out.println("Tabulation = " + tabulationWay(n));
    }
}
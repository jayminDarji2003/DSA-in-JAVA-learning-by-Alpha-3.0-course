/*
    Climbing stairs :-
        Count ways to reach the nth stair.The person can climb either 1 stair or 2 stair at a time.

    We will solve this problem by three approaches:-    
        1. Recursion way
        2. DP way
            i. Memoization
            ii. Tabulation


    LOGIC :-
        1. RECURSION WAY:-
            calculate : n-1 ways
            calculate : n-2 ways
            combine both ways --> n ways
*/

public class Climbing_stairs {

    // Recursive approach
    // O(2^n)
    public static int countStair_recursive(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return countStair_recursive(n - 1) + countStair_recursive(n - 2);
    }

    // Memoization approach
    // O(n)
    public static int countStair_memoization(int n, int[] dp) {
        // base case
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = countStair_memoization(n - 1, dp) + countStair_memoization(n - 2, dp);
        return dp[n];
    }

    // Tabulation approach
    // O(n)
    public static int countStair_Tabulation(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive approach ways = " + countStair_recursive(n));

        System.out.println("Memoization approach ways = " + countStair_memoization(n, new int[n + 1]));

        System.out.println("Tabulation approach ways = " + countStair_Tabulation(n));
    }
}

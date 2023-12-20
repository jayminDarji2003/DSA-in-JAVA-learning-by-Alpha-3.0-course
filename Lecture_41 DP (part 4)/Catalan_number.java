/*
    Catalan numbers :-
*/

import java.util.Arrays;

public class Catalan_number {
    // recursive way
    public static int catNum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += catNum(i) * catNum(n - i - 1);
        }
        return ans;
    }

    // Memoization way
    public static int catNumMemo(int n, int[] dp) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catNumMemo(i, dp) * catNumMemo(n - i - 1, dp);
        }

        return dp[n] = ans;
    }

    // Tabulation way
    public static int catNumTab(int n) {
        // create table
        int[] dp = new int[n + 1];

        // initialize base
        dp[0] = 1;
        dp[1] = 1;

        // fill data
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Recursion way ans = " + catNum(n));

        // memoization way
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Memoization way ans = " + catNumMemo(n, dp));

        System.out.println("Tabulation way ans = " + catNumTab(n));
    }
}

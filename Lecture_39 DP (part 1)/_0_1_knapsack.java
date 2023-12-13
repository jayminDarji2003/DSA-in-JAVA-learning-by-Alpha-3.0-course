/*
    0-1 Knapsack :-
        
*/

public class _0_1_knapsack {

    // recursion way
    public static int knapsack_recur(int val[], int wt[], int w, int n) {
        // base case
        if (w == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= w) { // valid condition
            // include
            int ans1 = val[n - 1] + knapsack_recur(val, wt, w - wt[n - 1], n - 1);

            // exclude
            int ans2 = knapsack_recur(val, wt, w, n - 1);

            return Math.max(ans1, ans2);
        } else { // not valid condition
            return knapsack_recur(val, wt, w, n - 1);
        }
    }

    // memoization way
    public static int knapsack_memo(int val[], int wt[], int w, int n, int dp[][]) {
        // base case
        if (w == 0 || n == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) { // valid condition
            // include
            int ans1 = val[n - 1] + knapsack_memo(val, wt, w - wt[n - 1], n - 1, dp);

            // exclude
            int ans2 = knapsack_memo(val, wt, w, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);

            return dp[n][w];
        } else { // not valid condition
            dp[n][w] = knapsack_memo(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;

        // recursion way
        System.out.println("Recursion way result = " + knapsack_recur(val, wt, w, val.length));

        // memoization way
        int dp[][] = new int[val.length + 1][w + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Memoization way result = " + knapsack_memo(val, wt, w, val.length, dp));
    }
}

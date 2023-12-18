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

    // helper function // print dp
    public static void printDP(int dp[][]) {
        System.out.println("---------- Printing DP (Tabulation way) \n");

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Knapsack - Tabulation way
    public static int knapsack_tab(int val[], int wt[], int w) {
        int n = val.length;
        // step 1 : CREATE TABLE
        int dp[][] = new int[n + 1][w + 1];

        // step 2 : INITIALIZE TABLE (BASE CASES)
        for (int i = 0; i < dp.length; i++) { // 0th column
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th row
            dp[0][j] = 0;
        }

        // step 3 : FILLING DATA TO THE TABLE
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int value = val[i - 1]; // ith item value
                int weight = wt[i - 1]; // ith item weight

                if (weight <= j) { // valid condition
                    int incProfit = value + dp[i - 1][j - weight];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid condition
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        printDP(dp);

        return dp[n][w];
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

        System.out.println("Tabulation way result = " + knapsack_tab(val, wt, w));
    }
}

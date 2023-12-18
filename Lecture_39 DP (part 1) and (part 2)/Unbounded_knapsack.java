/*
    Unbounded Knapsack :-

*/

public class Unbounded_knapsack {

    public static int unboundedKnapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < W + 1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int value = val[i - 1]; // ith item value
                int weight = wt[i - 1]; // ith item weight

                if (weight <= j) { // valid condition
                    int incProfit = value + dp[i][j - weight];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid condition
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][W];

    }

    public static void main(String[] args) {
        int arr[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println(unboundedKnapsack(arr, wt, W));
    }
}

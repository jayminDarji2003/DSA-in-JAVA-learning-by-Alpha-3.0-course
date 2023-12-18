/*
    Longest common subsequence :-
        1. recursion way
        2. Memoization way
        3. Tabulation way
*/

public class LCS {

    // recursion way
    public static int lcsRec(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) { // same case
            return lcsRec(s1, s2, n - 1, m - 1) + 1;
        } else { // different case
            int ans1 = lcsRec(s1, s2, n - 1, m);
            int ans2 = lcsRec(s1, s2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    // Memoization way
    public static int lcsMemo(String s1, String s2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) { // same case
            return dp[n][m] = lcsMemo(s1, s2, n - 1, m - 1, dp) + 1;
        } else { // different case
            int ans1 = lcsMemo(s1, s2, n - 1, m, dp);
            int ans2 = lcsMemo(s1, s2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abege";
        int n = str1.length();
        int m = str2.length();
        System.out.println("Recursion way ans = " + lcsRec(str1, str2, n, m));

        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println("Memoization way ans = " + lcsMemo(str1, str2, n, m, dp));
    }
}

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

    // Tabulation way
    public static int lcsTabu(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
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

        System.out.println("Tabulation way ans = " + lcsTabu(str1, str2));
    }
}

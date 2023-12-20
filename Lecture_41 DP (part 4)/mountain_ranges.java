/* 
    MOUNTAIN RANGES :-  WE WILL WRITE SAME CODE AS CATALAN'S CODE WRITE.
*/

public class mountain_ranges {
    public static int mountainRanges(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRanges(n));
    }
}

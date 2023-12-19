/*
    Longest common substring :- 
*/

public class Longest_common_substring{
    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        // create 2d array
        int dp[][] = new int[n+1][m+1];
        int ans = 0;

        // filling data
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ABGCE";
        System.out.println("Longest common substring = "+lcs(s1, s2));
    }   
}
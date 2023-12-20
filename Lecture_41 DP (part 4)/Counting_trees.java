/*
    Counting BST :-

    total BST = catalan(n)
    
    write same code here as catalan question write.
*/

public class Counting_trees {
    public static int countBST(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<n+1; i++){
            // Cal Ci
            for(int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countBST(n));
    }
}

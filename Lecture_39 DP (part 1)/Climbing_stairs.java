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
    public static int countStair_recursive(int n){
        // base case
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countStair_recursive(n-1) + countStair_recursive(n-2);
    }

    // Memoization approach
    public static int countStair_memoization(int n, int[] dp){
        // base case
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = countStair_memoization(n-1, dp) + countStair_memoization(n-2, dp);
        return dp[n];
    }
    
    public static void main(String[] args) {
        int n = 5;  
        System.out.println("Recursive approach ways = " + countStair_recursive(n));      
        System.out.println("Recursive approach ways = " + countStair_memoization(n, new int[n+1]));      
    }
}

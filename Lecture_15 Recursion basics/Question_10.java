/*
    Q. print x^n :- Optimized way.
    Time complexity will be O(long n)
 */

public class Question_10 {
    public static int optimizedPower(int a, int n){
        // base case
        if(n == 0){
            return 1;
        }

        // do work
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a=2;
        int n=5;
        System.out.println(optimizedPower(a, n));
    }
}

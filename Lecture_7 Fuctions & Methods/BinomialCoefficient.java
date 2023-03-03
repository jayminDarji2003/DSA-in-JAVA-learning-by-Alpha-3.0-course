/*
    Binomial coefficient
        BC = n! / r! * (n-r)!
*/

public class BinomialCoefficient {
            
    // factorial function
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    // calculate binomial coefficient
    public static int calBC(int n,int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int NmRFact = factorial(n-r);

        int BC = nFact / (rFact * NmRFact);

        return BC;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int bc = calBC(n, r);
        System.out.println("The Binomial Coefficient is : " + bc);
        
    }

}
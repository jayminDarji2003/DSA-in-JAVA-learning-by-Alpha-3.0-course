// Q.13 Friends pairing problem

public class Question_13 {

    public static int friendsPairing(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }

        // choice
        // single
        int fnm1 = friendsPairing(n-1);

        // pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3) + " ways");
    }
}

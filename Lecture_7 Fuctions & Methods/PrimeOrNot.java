import java.util.Scanner;

public class PrimeOrNot {

    public static boolean checkPrime(int n){
        if(n == 1){
           return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Program:- Check if a number prime or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Check number prime or not : ");
        int num = sc.nextInt();

        System.out.println( checkPrime(num));
       

        sc.close();
    }
}

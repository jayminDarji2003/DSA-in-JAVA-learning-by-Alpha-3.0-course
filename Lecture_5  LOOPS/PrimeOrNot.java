import java.util.*;

// Checnk if a number Prime or not

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // n is multipul of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("N is prime number");
            } else {
                System.out.println("N is not prime number");
            }

        }

        sc.close();
    }
}

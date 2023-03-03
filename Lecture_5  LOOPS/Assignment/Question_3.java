import java.util.Scanner;

public class Question_3 {

        // Find factorial of n number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println("Factorial is : " + fact);

        sc.close();
    }
}

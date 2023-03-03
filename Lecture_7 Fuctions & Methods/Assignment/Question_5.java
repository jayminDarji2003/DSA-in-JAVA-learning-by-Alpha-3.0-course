import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        System.out.println("The sum of digits is : " + sumDigits(number));

        sc.close();
    }

    public static int sumDigits(int n){
        int sumDigits = 0;
        
        while(n > 0){
            int lastDigit = n % 10;
            sumDigits += lastDigit;
            n = n / 10;
        }
        return sumDigits;
    }
}

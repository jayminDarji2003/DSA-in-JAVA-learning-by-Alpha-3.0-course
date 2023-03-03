import java.util.Scanner;

// program :- Whether number positive or negative

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int number = sc.nextInt();

        // way 1
        if (number > 0) {
        System.out.println("Number is positive");
        }
        else if (number == 0) {
        System.out.println("Number is zero");
        }
        else {
        System.out.println("Number is negative");
        }

        // way 2

        // String result = (number > 0) ? "Number is positive" : "Number is negative";
        // System.out.println(result);

        sc.close();

    }
}

import java.util.Scanner;

public class Question_1 {

    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3 ;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        System.out.println("The average is : " + average(a, b, c));

        sc.close();
    }
}

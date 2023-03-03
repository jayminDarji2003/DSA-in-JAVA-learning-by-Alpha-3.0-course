import java.util.Scanner;

public class Calsum {

    public static void calSum(int a, int b){
        int sum = a + b;
        System.out.println("The sum is : " + sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        calSum(a,b);

        sc.close();
    }
}

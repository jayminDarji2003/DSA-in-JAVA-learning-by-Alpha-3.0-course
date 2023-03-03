import java.util.Scanner;
public class CalculateSum {

    public static void calSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("The sum of a and b is : " + (a+b));
        sc.close();
        return;
    }

    public static void main(String[] args) {
        calSum();
    }
}

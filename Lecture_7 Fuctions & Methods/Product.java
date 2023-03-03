import java.util.Scanner;

public class Product {

    public static int product(int a, int b){
        return (a * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int pro = product(a, b);
        System.out.println(pro);

        sc.close();
    }
}

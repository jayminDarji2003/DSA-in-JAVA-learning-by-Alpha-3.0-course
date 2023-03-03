import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14F;

        System.out.print("Enter radius : ");
        float r = sc.nextFloat();
        float area = pi * r * r;
        System.out.println(area);

        sc.close();
    }
}

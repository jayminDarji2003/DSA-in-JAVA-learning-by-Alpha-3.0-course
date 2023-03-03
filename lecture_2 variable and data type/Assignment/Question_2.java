import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square : ");
        int side = sc.nextInt();
        
        int area = side * side;

        System.out.println("The area of square is : " + area);

        sc.close();
    }
}

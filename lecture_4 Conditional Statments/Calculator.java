import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter your operation : (+ , - , * , / , %) : ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default : 
                System.out.println("Opps!!!..Enter correct operator");
        }



        sc.close();
    }
}

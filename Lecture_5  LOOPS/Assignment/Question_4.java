import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        // Print multiplication table

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number of table you want to print : ");
        int n= sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }

        sc.close();
    }
}

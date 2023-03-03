import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any year : ");
        int year = sc.nextInt();

        boolean x = (year % 4 ) == 0;
        boolean y = (year % 100 ) != 0;
        boolean z = ((year % 100 ) == 0)  && ((year % 400 ) == 0);

        if(x && (y || z)){
                System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }


        sc.close();
    }
}

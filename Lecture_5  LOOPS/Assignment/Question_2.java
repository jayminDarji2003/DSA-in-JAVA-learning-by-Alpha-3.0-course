import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //Write a program that reads a set of integers, and then prints the sum of the even and odd integer

        Scanner sc = new Scanner(System.in);
        
        int even = 0, odd = 0,choice;

        do{
            System.out.print("Enter number : ");
            int n = sc.nextInt();

            if(n % 2 == 0){
                even = even + n;
            }else{
                odd = odd + n;
            }

           System.out.print("Do you want to add data.Enter your choice 1 for yes and 0 for no: ");
           choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("The sum of even numbers is : " + even);
        System.out.println("The sum od odd numbers is : " + odd);

        sc.close();
    }
}

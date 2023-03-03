import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;

        if(income < 500000){
            System.out.println("Income tax is : " + tax);    
        }
        else if(income > 500000 && income < 1000000){
            tax =(income * 20) /100;
            System.out.println("Income tax is : " + tax);
        }
        else{
            tax = (income * 30)/100;
            System.out.println("Income tax is : " + tax);
        }

        sc.close();

    }
}

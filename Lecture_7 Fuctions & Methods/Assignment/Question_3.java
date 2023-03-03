import java.util.Scanner;

// Number palindrome is not 

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("The number " + num + " is palindrome");
        }else{
            System.out.println("The number " + num + " is not palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;    // getting last digit
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;   // remove last digit
        }

        if(reverse == number){
            return true;
        }
        return false;
    }

    
}

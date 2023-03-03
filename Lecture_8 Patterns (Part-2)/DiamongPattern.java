/*
        pattern Diamond print

              *
             ***
            *****
           *******
          *********
          *********
           *******
            *****
             ***
              *


 */


public class DiamongPattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        // outer loop--> 1 to n
        for(int i=1; i<=n; i++){
            //spaces --> n-i
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            //star --> 1 to s(i)-1
            for(int star=1; star<=2*i-1; star++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        // outer loop--> n to 1
        for(int i=n; i>=1; i--){
            //spaces --> n-i
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            //star --> 1 to s(i)-1
            for(int star=1; star<=2*i-1; star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

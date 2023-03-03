public class ButterflyPattern {
    public static void main(String[] args) {
        butterfly_pattern(4);
    }

    public static void butterfly_pattern(int n){
        //first part

            //outer loop
        for(int i=1; i<=n; i++){
            // star (i)
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //space 2*(n-i)
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }

            //star (i)
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }


            // second half

            //outer loop
        for(int i=n; i>=1; i--){
            // star (i)
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }

            //space 2*(n-i)
            for(int space=1; space<=2*(n-i); space++){
                System.out.print(" ");
            }

            //star (i)
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

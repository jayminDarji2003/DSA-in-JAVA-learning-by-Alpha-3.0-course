public class Pattern_6 {
    public static void main(String[] args) {
        int n=4;

        for(int i=1; i<=n; i++){
            //first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int spaces=2 * (n-i);
            for(int space=1; space <= spaces; space++){
                System.out.print(" ");
            }
            //last part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            //first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            int spaces=2 * (n-i);
            for(int space=1; space <= spaces; space++){
                System.out.print(" ");
            }
            //last part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

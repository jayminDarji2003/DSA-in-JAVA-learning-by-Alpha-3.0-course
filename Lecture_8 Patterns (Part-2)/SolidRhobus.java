public class SolidRhobus {
    public static void main(String[] args) {
        print(5);
    }   

    public static void print(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //spaces == n-i
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            //star = n
            for(int star=1; star<=n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

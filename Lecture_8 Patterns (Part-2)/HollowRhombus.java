public class HollowRhombus {
    public static void main(String[] args) {
        hollo_rhombus(5);
    }

    public static void hollo_rhombus(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            // hollow rhombus
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

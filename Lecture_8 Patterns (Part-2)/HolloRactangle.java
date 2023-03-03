/*      --> Print :- Hollow Ractangle

        * * * * * 
        *       *
        *       *
        * * * * *
*/


public class HolloRactangle {
    public static void main(String[] args) {
        // Hollow Ractangle
        holloRactangle(4, 5);
    }

    public static void holloRactangle(int n,int m){
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
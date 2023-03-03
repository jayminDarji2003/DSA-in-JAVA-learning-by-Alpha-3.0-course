public class ZeroOneTriangle {
    public static void main(String[] args) {
        zeroOneTriangle(7);
    }

    public static void zeroOneTriangle(int n){
            //outer loop(track row)
        for(int i=1; i<=n; i++){
                //inner loop(print 0 or 1)
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

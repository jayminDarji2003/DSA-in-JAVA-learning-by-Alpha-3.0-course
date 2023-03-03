public class FloydsTriangle {
    public static void main(String[] args) {
        floaydsTriangle(5);
    }

    public static void floaydsTriangle(int n){
        int count = 1;
        // outer loop(track row)
        for(int i=1; i<=n; i++){
                //inner loop(print counter)
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

public class Pattern_2 {
    public static void main(String[] args) {
        int n = 5;

        // //outer loop
        for (int i = n; i > 0; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // second method

        // outer loop
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }
    }
}

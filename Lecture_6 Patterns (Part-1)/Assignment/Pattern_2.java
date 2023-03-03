public class Pattern_2 {
    public static void main(String[] args) {
        int n = 4;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loops

            //space
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // star
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

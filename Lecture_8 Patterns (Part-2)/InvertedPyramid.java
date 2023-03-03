/*      --> Print inverted and rotated half pyramid

                *
               **
              ***
             ****
            *****

 */

public class InvertedPyramid {
    public static void main(String[] args) {
        invertedPyramid(5);
    }

    public static void invertedPyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //to print space
            for(int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }
            // to print star(*)
            for(int star=1; star<=i; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

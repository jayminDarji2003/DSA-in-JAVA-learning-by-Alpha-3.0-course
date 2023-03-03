/*

    print number pyramid:-
                1 
               2 2 
              3 3 3 
             4 4 4 4 
            5 5 5 5 5 
*/
public class NumberPyramid {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //space
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            
            //print number
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        } 
    }

}

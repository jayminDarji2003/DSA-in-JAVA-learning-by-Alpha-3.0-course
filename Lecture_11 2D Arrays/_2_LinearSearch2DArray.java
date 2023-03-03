import java.util.Scanner;

public class _2_LinearSearch2DArray {

    public static boolean linearSearch(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // create 2D array called matrix

        int n = 3;  // rows     -->  we can also use  --> matrix.length
        int m = 3;  // columns  -->   we can also use --> matrix[0].length

        int matrix[][] = new int[n][m];

        Scanner sc = new Scanner(System.in);

        // Adding data
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output data
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 

        int searchElement;
        System.out.print("Search Element : ");
        searchElement = sc.nextInt();

        linearSearch(matrix,searchElement);

        sc.close();
    }
}

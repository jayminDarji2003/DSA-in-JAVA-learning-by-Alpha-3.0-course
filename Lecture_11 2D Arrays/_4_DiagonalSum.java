public class _4_DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println("Diagoanl sum is : " + diagonalSum(matrix));
        System.out.println("Diagoanl sum is : " + diagonalSum2(matrix));
    }


    // first approach
    public static int diagonalSum(int matrix[][]){  // time complexity 0(n^2)
        int sum = 0 ;
       
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                // primary diagonal sum
                if(i == j){
                    sum += matrix[i][j];    
                }
                // secondry diagoanl sum
                else if(i+j == matrix.length - 1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }



    // second approach
    public static int diagonalSum2(int matrix[][]){
        int sum=0;

        for(int i=0; i<matrix.length; i++){     // time complexity is O(n)

            //pd
            sum += matrix[i][i];
            
            //sd
            if(i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
}

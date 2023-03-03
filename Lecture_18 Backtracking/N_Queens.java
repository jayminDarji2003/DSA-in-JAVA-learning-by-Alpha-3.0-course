public class N_Queens {

    public static boolean isSafe(char board[][] , int row, int col){
        // vertical
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // left up diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // right up diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    // fnx of set nQueens
    public static void nQueens(char board[][] , int row){
        // base case
        if(row == board.length){
            printBoard(board);
            return;
        }        
        
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);  // recursion
                board[row][j] = 'X';    // backtracking step
            }
        }
    }

    // print board
    public static void printBoard(char board[][]){
        System.out.println("--------- Chess Board -----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        // initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board,0);
    }
}

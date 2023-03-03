/**
 * _5_searchSortedMatrix
 * use stair case search for this question for less time complexity
 */
public class _5_searchSortedMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // System.out.println(stairCaseSearching(matrix, 11));
        stairCaseSearching(matrix, 0);
    }

    // staircase searching
    
    public static boolean stairCaseSearching(int metrix[][], int key) {
        int row = 0, col = metrix.length - 1;

        while (row < metrix.length && col >= 0) {
            if (metrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            
            else if (key < metrix[row][col]) {
                col--;
            }
            
            else {
                row++;
            }
        }

        System.out.println("key is not  found!!");
        return false;
    }

}

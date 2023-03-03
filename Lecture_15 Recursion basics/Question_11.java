/*  
    Amazon asked this question.
    Q. Tiling problem. How many ways we can fill tiles into floors.
 */

public class Question_11 {

    // function to calculate ways of filling tiles into floor.
    public static int tillingProblem(int n){    // 2 x n (floor size)
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
  
        // kaam
        // vertical choice
        int fnm1 = tillingProblem(n-1);

        //horizontal choice
        int fnm2 = tillingProblem(n-2); 

        // total ways
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}

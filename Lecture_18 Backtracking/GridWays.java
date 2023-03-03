    // Grid ways :- Find no of ways to reach destination(n-1,m-1).

public class GridWays {

    // function of calculate no of ways to reach destination
    public static int gridWays(int i, int j, int n, int m){
        // base case
        if(i==n-1 && j==m-1){   // condition for last cell
            return 1;
        }
        else if(i == n || j == m){  //boundry cross condition
            return 0;
        }

        // kaam
        int w1 = gridWays(i+1, j, n, m); // down ways
        int w2 = gridWays(i, j+1, n, m); // right ways

        return w1 + w2;
    }
    
    public static void main(String[] args) {
        int n=3 , m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}

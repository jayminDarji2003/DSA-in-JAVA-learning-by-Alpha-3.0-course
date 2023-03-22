/*
    Q.1 :- Balanced partition :- Maximum Balanced String partition 
*/

package Assignment;

public class Q_1 {
    // balanced partition fnx
    static int balancedPartition(String str, int n) {
        // base case
        if (n == 0) {
            return 0;
        }

        int r = 0, l = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } 
            else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "LLRRRLLRRL";
        int n = str.length();

        System.out.println("The ans is = " + balancedPartition(str, n));
    }
}


/*
    Q.4 :- Trapping rain water

    Time Complexity = O(n)
    Space Complexity = O(n)
    
    We already solve this question using array
*/
import java.util.*;

public class Q_4 {

    public static int trapWater(int height[]) {
        Stack<Integer> s = new Stack<>();
        int n = height.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            while ((!s.isEmpty()) && (height[s.peek()] < height[i])) {
                int pop_height = height[s.peek()];
                s.pop();
                if (s.isEmpty()) {
                    break;
                }
                int distance = i - s.peek() - 1;
                int min_height = Math.min(height[s.peek()], height[i]) - pop_height;
                ans += distance * min_height;
            }
            s.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int arr2[] = { 7, 0, 4, 2, 5, 0, 6, 4, 6 };
        System.out.println(trapWater(arr));
        System.out.println(trapWater(arr2));
    }
}

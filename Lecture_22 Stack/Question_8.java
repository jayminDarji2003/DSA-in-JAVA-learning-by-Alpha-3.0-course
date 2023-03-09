/*
Q.8 :- Maximum Rectangle Area in Histogram

Note := Hard Question
*/

import java.util.Stack;

public class Question_8 {

    public static void maxArea(int arr[]) {  // O(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length]; // nsr = next smaller right
        int nsl[] = new int[arr.length]; // nsl = next smaller left

        // Next Smaller Right O(n)
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left O(n)
        s = new Stack<>(); // "stack ne khali karyo"
        for (int i = 0; i<arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1 ;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area  o(n)
        // width = j - i -1 = nsr[i] - nsl[i] - 1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max area in Histrogram is = " + maxArea);
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 }; // height in histogram
        maxArea(heights);
    }
}

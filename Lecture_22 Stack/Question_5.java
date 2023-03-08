
/*
    Q.5 :- Find next greater

    This question have many forms
        1. next greater right
        2. next greater left
        3. next smaller right
        4. next smaller left
 */
import java.util.*;

public class Question_5 {

    // Next greater element fnx

    // Stack Approach TC = O(n)
    // next greater right
    public static void nxtGreaterRight(int arr[], int nxtGreater[], Stack<Integer> s) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            // step 1 --> while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // step 2 --> if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // step 3 --> push is stack
            s.push(i);
        }
    }

    // next greater left
    public static void getNxtGtrLeft(int arr[], int nxtGreater[], Stack<Integer> s) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // step 1 --> while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // step 2 --> if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // step 3 --> push is stack
            s.push(i);
        }
    }

    // Brute force Approach TC = O(n^2)
    public static void nxtGreaterRight(int arr[], int nxtGreater[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                nxtGreater[i] = -1;
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nxtGreater[i] = arr[j];
                    break;
                } else {
                    nxtGreater[i] = -1;
                }
            }
        }
    }

    // next smaller Left
    public static void getNxtSmallLeft(int arr[], int nxtGreater[], Stack<Integer> s) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // step 1 --> while loop
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            // step 2 --> if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // step 3 --> push is stack
            s.push(i);
        }
    }

    // next smaller right
    public static void getNxtSmallRight(int arr[], int nxtGreater[], Stack<Integer> s) {
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            // step 1 --> while loop
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            // step 2 --> if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // step 3 --> push is stack
            s.push(i);
        }
    }

    // Print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nxtGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        printArr(arr);

        // next greater
        // nxtGreaterRight(arr, nxtGreater); // for brute force approach
        nxtGreaterRight(arr, nxtGreater, s); // for next greater Right
        // getNxtGtrLeft(arr, nxtGreater, s); // for next greater Left

        // next smaller
        // getNxtSmallRight(arr, nxtGreater, s); // next smaller right
        // getNxtSmallLeft(arr, nxtGreater, s); // next smaller left

        printArr(nxtGreater);
    }
}

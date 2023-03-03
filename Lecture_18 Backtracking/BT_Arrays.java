// Backtracking on Arrays 


public class BT_Arrays {

    // to change value of an array
    public static void changeArr(int arr[], int i, int val){
        // steps
        // 1. base case
        // 2.kaam --> recursion

        // base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        // kaam
        arr[i] = val;
        changeArr(arr, i+1, val+1);

        // when return
        arr[i] = arr[i] - 2;

    }

    // to print an array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5]; // to make empty array
        changeArr(arr, 0, 1);   // to change value
        printArr(arr);  // final array
    }    
}
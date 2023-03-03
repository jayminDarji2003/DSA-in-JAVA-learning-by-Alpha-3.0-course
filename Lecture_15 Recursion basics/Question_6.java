/*
    Q. Check if a given array sorted or not.
 */
public class Question_6 {
    public static boolean isSorted(int arr[],int i){
        // base case
        if(i == arr.length-1){
            return true;
        }

        //do work
        if(arr[i] > arr[i+1]){
            return false;
        }

        // call itself and return
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}

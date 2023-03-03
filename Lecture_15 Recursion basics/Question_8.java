/*
    Write a function to find last occurance of an element in an array.
 */

public class Question_8 {
    public static int lastOcc(int arr[], int key, int i){
        // base case
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOcc(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    
    public static void main(String[] args) {
        int arr[] = {3,8,6,9,5,10,2,5,3};
        System.out.println(lastOcc(arr, 5, 0));
    }
}


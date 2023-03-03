/*
    Q. WTF to find the first occurance of an element in an array.
    ->WTF means write a function. 
 */

public class Question_7 {
    public static int firstOcc(int arr[],int key,int i){
        // base case
        if(i == arr.length){
            return -1;
        }

        //do work
        if(arr[i] == key){
            return i;
        }

        // call and return
        return firstOcc(arr, key, i + 1);
    }

    public static void main( String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(firstOcc(arr, 5, 0));
    }
}

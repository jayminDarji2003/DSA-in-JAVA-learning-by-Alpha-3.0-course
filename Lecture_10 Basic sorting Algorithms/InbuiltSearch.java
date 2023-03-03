import java.util.Arrays;
import java.util.Collections;

public class InbuiltSearch {
    public static void main(String[] args) {
        
        // sort array in acending order
        
        int arr[] = {5,6,3,7,8,4,2,1};
        Arrays.sort(arr);    // sort whole array/

        // Arrays.sort(arr,0,5);   // sort between to indexes
        //printArray(arr);




        // sort array in descending order
        Integer arr2[] = {5,6,3,7,8,4,2,1};
        Arrays.sort(arr2,Collections.reverseOrder());//this methods will reverse sorted array

        //Arrays.sort(arr2,0,5,Collections.reverseOrder());//this function will sort array between two indexes 
       // printArray(arr2);
    }   

    // to print the arrays --> for ascending order 
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // to print the arrays --> for descending order 
    public static void printArray(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

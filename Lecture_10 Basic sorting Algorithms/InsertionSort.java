public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArray(arr);
    }

    // insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int prev= i-1;

            // finding out correct posision to insert   
            while(prev >= 0 && (arr[prev] > arr[curr])){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    // print array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

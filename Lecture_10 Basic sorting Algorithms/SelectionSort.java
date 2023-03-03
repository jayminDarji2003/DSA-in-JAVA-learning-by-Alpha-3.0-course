public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // increasing order
        selectionSort(arr);

        // decreasing order
        // selectionSort2(arr);

        printArray(arr);
    }
        // sorting in increasing order
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


        // sorting in decreasing order
    public static void selectionSort2(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
            // print the array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

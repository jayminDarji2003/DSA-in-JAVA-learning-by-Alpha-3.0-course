
// Quick sort algorithm

public class QuickSort {

    // Print Array function print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick sort Algorithm
    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // pivote
        // last index

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, ei); // right part

    }

    // partition function
    public static int partition(int arr[], int si, int ei) {
        int pivote = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivote

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivote) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivote;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

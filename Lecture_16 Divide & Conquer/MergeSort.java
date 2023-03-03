// Merge Sort Algorithm

public class MergeSort {

    // Print Array --> printint the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // merge Sort algorithm
    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2; // calculate mid
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part

        // merge
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];

        // making iterator
        int i = si; // for left part
        int j = mid + 1; // for right part
        int k = 0; // for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }   
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
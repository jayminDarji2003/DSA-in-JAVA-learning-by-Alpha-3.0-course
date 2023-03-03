/**
         --> BubbleSort
 */

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        // Know how many swap we did--> this is not in bubble sort
        bubbleSortTellSwap(arr);

        bubbleSort(arr);
        printArray(arr);

    }

    public static void bubbleSort(int arr[]) {
        for (int tern = 0; tern < arr.length - 1; tern++) {
            for (int j = 0; j < arr.length - 1 - tern; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




    // This function is not a part of bubble sort
    // This function tell how many swap we did.

    public static void bubbleSortTellSwap(int arr[]) {
        int swap = 0;
        for (int tern = 0; tern < arr.length - 1; tern++) {
            for (int j = 0; j < arr.length - 1 - tern; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                }
            }
        }
        System.out.println("swap = " + swap);
    }

}
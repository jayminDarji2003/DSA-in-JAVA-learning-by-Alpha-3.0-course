public class PrintSubArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubArray(arr);
    }

    public static void printSubArray(int arr[]){
        int ts=0;   // just for count total subarrays
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){  // print
                    System.out.print(arr[k] + " ");     // sub array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays is : " + ts);
    }
}

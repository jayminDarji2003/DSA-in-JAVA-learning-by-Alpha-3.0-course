public class PairsOfArray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printPairs(arr);
    }

    public static void printPairs(int arr[]){
        int tp=0;   // just for total pairs
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];  // 2 , 4 , 6 , 8 , 10

            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;   // total pairs
            }
            System.out.println();
        }
        System.out.println("total pairs is : " + tp);   // print total pairs
    }
}

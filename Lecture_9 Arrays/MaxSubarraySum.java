public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSubsrraysSum(arr);    
    }

    public static void maxSubsrraysSum(int arr[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;


        //start loop
        for(int i=0; i<arr.length; i++){
            int start = i;
            // end loop
            for(int j=i; j<arr.length; j++){
                int end = j;
                currSum = 0;
                //sum sub array
                for(int k=start; k<=end; k++){
                    currSum += arr[k];
                }
                System.out.print(currSum + "  ");

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("max subarray sum is : " + maxSum);

    }

}





public class MaxSubarraySum_prefixMethod {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubsrraysSum(arr);
    }

    public static void maxSubsrraysSum(int arr[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // start loop
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            // end loop
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                currSum = (start == 0) ? (prefix[end] ):( prefix[end] - prefix[start - 1]);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max subarray sum is : " + maxSum);
    }
}

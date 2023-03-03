public class MaxSubarraySum_KadasMethod {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubarraySum(arr);
    }

    public static void maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            maxSum = Math.max(cs, maxSum);
        }
        System.out.println("Max subarray sum is : " + maxSum);
    }
}

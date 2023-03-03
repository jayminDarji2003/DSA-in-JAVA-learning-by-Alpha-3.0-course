public class Question_2_approach2 {

    public static void main(String[] args) {
        int nums[] = {4,  5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        return binarySearch(nums, low, high, target);
    }

    public static int binarySearch(int[] nums, int low, int high, int target) {
        int mid = (low + high) / 2, left = -1, right = -1;
        if (low <= high) {
            if (nums[mid] == target)
                return mid;
            else {
                left = binarySearch(nums, low, mid - 1, target);
                right = binarySearch(nums, mid + 1, high, target);
            }
        }
        return Math.max(left, right);
    }
}

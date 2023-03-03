import java.util.ArrayList;

public class Question_3 {

    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[100];

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=0; i<100; i++){
            if(result[i] > max){
                max = result[i];
                ans = i+1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        int key = 2;

        System.out.println(mostFrequent(nums, key));
    }
}

import java.util.*;

// Find and print lovely numbers in ArrayList

public class Question_2 {

    // find lovely number function
    public static ArrayList<Integer> findLovely(ArrayList<Integer> nums) {
        Collections.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();

        // check condition and adding the value
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }

        if (nums.size() == 1) {
            list.add(nums.get(0));
        }

        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }

            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size()-1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println((nums));
        System.out.println(findLovely(nums));

    }
}

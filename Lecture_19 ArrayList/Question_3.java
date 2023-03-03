import java.util.*;

// Find if any pair in a sorted  & rotated Arraylist has a target sum

public class Question_3 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        // cal breaking point
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i; // got breaking point
                break;
            }
        }

        int lp = bp + 1; // smallest
        int rp = bp; // largest

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // case 3
            else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11 15 6 8 9 10 - sorted and rotated AL
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int taret = 1006;
        System.out.println(pairSum2(list, taret));
    }
}

import java.util.ArrayList;

    // pair sum problem
public class Question_2 {

    // Brute force - 1st way
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i + 1; j < list.size(); j++) {
    //             if (list.get(i) + list.get(j) == target) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // Pointer approach - 2nd way
    public static boolean pairSum1(ArrayList<Integer> list, int taret) {
        int lp = 0;
        int rp = list.size() - 1;

        while(lp != rp){
            // case 1
            if(list.get(lp) + list.get(rp) == taret){
                return true;
            }

            // case 2
            if(list.get(lp) + list.get(rp) < taret){
                lp++;
            }

            // case 3
            else{  
                rp--;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int taret = 5;
        System.out.println(pairSum1(list, taret));
    }
}

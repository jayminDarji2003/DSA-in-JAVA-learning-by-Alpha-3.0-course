
/*
    Q.7:- Chocola Problem
*/
import java.util.*;

public class Question_7 {
    public static void main(String[] args) {
      //  int n = 4, m = 6;   // just for understanding
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        // step 1 = sort the costs --> descending order sort
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // step 2
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            // case 1 : ver cost < hor cost
            if (costVer[v] <= costHor[h]) {
                // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                // vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        // remaining horzontal cuts
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        // remaining vertical cuts
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Min cost of cuts = " + cost);
    }
}

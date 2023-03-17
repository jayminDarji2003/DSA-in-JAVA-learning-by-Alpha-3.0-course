/*
    Q.1 :- Activity section
*/
import java.util.*;

public class Question_1 {
    // activity section fnx
    // when end is sorted
    public static void activitySec(int start[], int end[]) {
        // end time basis sorted activity
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>(); // store index of activity

        // first activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }


    // activity section fnx 
    // when end is not sorted
    public static void activitySec2(int start[] , int end[]){
        // when don't give sorted end then
        /*
         * In the above --> activities array
         * row = start.length
         * column = 3
         * -index
         * -start
         * -end
         * 
         * ex:-
         * start = [1,2,3]
         * end = [2,4,6]
         * 
         * 2D array
         * 
         * index start end --> colums
         * 0 1 2 --> will be A0
         * 1 2 4 --> will be A1
         * 2 3 6 --> will be A2
         */

         // step 1 : sorting 
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>(); // store index of activity

        // first activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2]; // end time

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1]>= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();

        // lamda function -> short form --> comparator
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // above logic is (o -> o[2])
        // means soting using col no 2

    } 



    public static void main(String[] args) { // O(n) --> whole process
        int start[] = { 1, 3, 0, 5, 8, 9 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        activitySec(start, end);
        System.out.println();
        activitySec2(start, end);
    }
}

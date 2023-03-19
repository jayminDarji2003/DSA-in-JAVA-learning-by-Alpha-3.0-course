
/*
    Q.6 :- Job Sequencing Problem
*/
import java.util.*;

public class Question_6 {
    static class Job {
        int deadLine;
        int profit;
        int id; // 0(A) , 1(B) , 2(c)..

        Job(int i, int d, int p) {
            id = i;
            deadLine = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // lamda fnx
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  // sort in descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadLine > time){
                seq.add(curr.id);
                time++;
            }
        }

        //print seq
        System.out.println("Max jobs = " + seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
    }
}

/*
    Q.2 :- Connect N ropes
        ropes means Rassi (Dordu).

    -> we are given N ropes of different lenght, the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their length.

    step1 :- create priority queue
    step2 :- store ropes value to pq
    // loop till pq have element 1.
    step3 :- remove 2 small value and add to cost
    step4 :- and add 2 small value sum to pq.

*/

import java.util.PriorityQueue;

public class Q_2 {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // store ropes value to pq
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }

        System.out.println("The cost of connecting n ropes is : " + cost);
    }
}

/*
    Store class object to Priority Queue

    step1 :- implement comparable interface
*/


package revision;

import java.util.*;

public class StoreObj {
    // declare class
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // create pq
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // adding data to pq
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 7));

        // print and remove data from pq
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}

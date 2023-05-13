/*
    1. Operation on primitive data --> Priority Queue.
    2. Operation on objects      ----> priority Queue.
*/

package revision;

import java.util.*;

public class MixPQ {
    // define class 
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // Method 1

        // operation primitive data
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        // add data to pq1
        pq1.add(4);
        pq1.add(8);
        pq1.add(9);
        pq1.add(1);
        // removing element to pq1
        System.out.println("Printing first Priority Queue data");
        while(!pq1.isEmpty()){
            System.out.println(pq1.peek());
            pq1.remove();
        }


        // Method 2
        PriorityQueue<Student> pq2 = new PriorityQueue<>();
        pq2.add(new Student("A", 77));
        pq2.add(new Student("B",56));
        pq2.add(new Student("C", 84));
        pq2.add(new Student("D", 10));

        System.out.println("Printing second Priority Queue data");
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek().name + " -> " + pq2.peek().rank);
            pq2.remove();
        }
    }
}

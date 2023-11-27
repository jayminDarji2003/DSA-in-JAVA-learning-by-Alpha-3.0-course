/*
 * Create a Graph using Adjacency List
 * -> Here we are using Array of Arraylist
 */

/*
                 (5)
           0 ---------- 1
                       / \
                  (1) /   \ (3)
                     /     \
                    /       \
                   2 ------- 3
                   |    (1)
                   |
               (2) |
                   |
                   4
   
   */

import java.util.*;

// public class create_graph {
//     // edge class
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     public static void main(String[] args) {
//         int V = 5;

//         ArrayList<Edge>[] Graph = new ArrayList[V];

//         for (int i = 0; i < V; i++) {
//             Graph[i] = new ArrayList<>();
//         }

//         // 0 vertex
//         Graph[0].add(new Edge(0, 1, 5));

//         // 1 vertex
//         Graph[1].add(new Edge(1, 0, 5));
//         Graph[1].add(new Edge(1, 2, 1));
//         Graph[1].add(new Edge(1, 3, 3));

//         // 2 verted
//         Graph[2].add(new Edge(2, 1, 1));
//         Graph[2].add(new Edge(2, 3, 1));
//         Graph[2].add(new Edge(2, 4, 2));

//         // 3 vertex
//         Graph[3].add(new Edge(3, 1, 3));
//         Graph[3].add(new Edge(3, 2, 1));

//         // 4 vertex
//         Graph[4].add(new Edge(4, 2, 2));

//         while (true) {
//             System.out.print("Enter number you want to see the neighbors [0-4] : ");
//             Scanner s = new Scanner(System.in);
//             int vertex = s.nextInt();

//             if (vertex < 0 || vertex > V) {
//                 System.out.println("Try again!!");
//                 continue;
//             }
//             System.out.println();

//             // print 2's neighbors
//             for (int i = 0; i < Graph[vertex].size(); i++) {
//                 System.out.print(Graph[2].get(i).dest + " ");
//             }
//             System.out.println();

//         }

//     }
// }

// SECOND TIME REVISION

public class create_graph {
    // Edge class
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        // create array of arraylist
        ArrayList<Edge>[] Graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            Graph[i] = new ArrayList<>();
        }

        // 0 vertex
        Graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        Graph[1].add(new Edge(1, 0, 5));
        Graph[1].add(new Edge(1, 2, 1));
        Graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        Graph[2].add(new Edge(2, 1, 1));
        Graph[2].add(new Edge(2, 3, 1));
        Graph[2].add(new Edge(2, 4, 2));

        // 3 vertex
        Graph[3].add(new Edge(3, 1, 3));
        Graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        Graph[4].add(new Edge(4, 2, 2));

        // print neighbours
        int n = 2;
        for (int i = 0; i < Graph[n].size(); i++) {
            Edge edge = Graph[n].get(i);
            System.out.println(edge.dest);
        }   
    }
}
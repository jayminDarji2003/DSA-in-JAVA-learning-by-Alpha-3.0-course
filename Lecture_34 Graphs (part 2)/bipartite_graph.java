/*
    Bipartite Graph:-
        Bi --> 2
        partite --> parts, partition
*/

import java.util.*;

public class bipartite_graph {
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }

    // Bipartite function
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        // creating color array to store color values
        int col[] = new int[graph.length];
        // assigning -1(no color) to every vertex
        for(int i=0; i<graph.length; i++){
            col[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){  // BFS PERFORM
                q.add(i);
                col[i] = 0; // red color
                while(!q.isEmpty()){
                    int curr = q.remove();
                    // call for neighbors
                    for(int j=0; j<graph[i].size(); j++){
                        Edge e = graph[curr].get(j);  // nei --> e.dest
                        
                        // case 3: not color
                        if(col[e.dest] == -1){
                            int nextColor = col[curr] == 1 ? 0 : 1;
                            col[e.dest] = nextColor;
                            q.add(e.dest);
                        }

                        // case 1 : same color
                        else if(col[e.dest] == col[curr]){
                            return false;
                        }

                    }
                }
            }
        }

        return true;
    }



    public static void main(String[] args) {

        // NOTE:- if graph doesn't have cycle --> BIPARTITE.

        /*
             0 ---------- 2
             |             \     
             |              4
             |              /
             1 ----------- 3 
        */

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}

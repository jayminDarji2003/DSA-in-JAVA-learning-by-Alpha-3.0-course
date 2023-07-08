/*
    Q. hashPath
        -> If path exist return true else return false.

    Approach :-
        recursive fnx

        step 1
            if(src == dest)
                return true

        step 2 
            visit[src] = true
        
        step 3 
            unvisited neighbout call
            if(!visit[neigh] && hashpath(src,dest))
                    return true
*/

import java.util.*;

public class Q_hashPath {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,1));
        graph[0].add(new Edge(0, 2,1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1,1));
        graph[3].add(new Edge(3, 4,1));
        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 2,1));
        graph[4].add(new Edge(4, 3,1));
        graph[4].add(new Edge(4, 5,1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }


    //   HashPath fnx
    // Time complexity : 0(V+E)
    public static boolean hashPath(ArrayList<Edge> graph[], int src, int dest, boolean visit[]){
        // case 1
        if(src == dest){
            return true;
        }

        visit[src] = true;

        // case 2
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visit[e.dest] && hashPath(graph,e.dest, dest, visit)){
                return true;
            }
        }

        // if path not exist
        return false;
    }


    public static void main(String[] args) {
        /*
            Graph:-
                
                  1 --- 3 --
                 /      |    \
                0       |     5 ---- 6
                 \      |    /
                  2 --- 4 --
        */


        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        System.out.println(hashPath(graph,0,5,new boolean[V]));
    }

}

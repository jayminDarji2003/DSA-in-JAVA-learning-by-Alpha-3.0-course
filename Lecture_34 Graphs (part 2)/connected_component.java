/*
    Connected components :-
        Graph :- Graph is a collection of different components. We can also say disjoint graphs.

        Components :-  means different graphs in a single graph but not joined in single graph.
*/
import java.util.*;

public class connected_component {
    // create Edge
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

        
        graph[0].add(new Edge(0, 1, 1));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        graph[6].add(new Edge(6, 7, 1));

        graph[7].add(new Edge(7, 6, 1));
        graph[7].add(new Edge(7, 8, 1));

        graph[8].add(new Edge(8, 7, 1));
        graph[8].add(new Edge(8, 9, 1));
        graph[8].add(new Edge(8, 10, 1));

        graph[9].add(new Edge(9, 18, 1));   
        
        graph[10].add(new Edge(10, 8, 1));
    }


    // * Breath First Search
    // public static void bfs(ArrayList<Edge> graph[]){
    //     boolean visit[] = new boolean[graph.length];
    //     for(int i=0; i<graph.length; i++){
    //         if(!visit[i]){
    //             bfsUtil(graph, visit,i);
    //         }
    //     }
    // }

    // private static void bfsUtil(ArrayList<Edge> graph[],boolean visit[],int src){
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(src);

    //     while(!q.isEmpty()){
    //         int curr = q.remove();

    //         if(!visit[curr]){
    //             System.out.print(curr + " ");
    //             visit[curr] = true;
    //             for(int i=0; i<graph[curr].size(); i++){
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
    // }


    // * Depth First Search
    public static void dfs(ArrayList<Edge> graph[]){
        boolean visit[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
            dfsUtil(graph, i, visit);
            }
        }
    }


    public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean visit[]){
        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfsUtil(graph,e.dest, visit);
            }
        }
    }

    public static void main(String[] args) {
        /*
            Graph : (A1 + A2)
            A1 and A2 is components and both make single graph.
            
             0 ----- 1                     6
                    |  \                   |
                    |   \                  |
                    2----3                 7 -------- 8
                    |    |                           / \
                    |    |                          /   \
                    4 -- 5                         9    10
                 
                ( --- A1----- )               ( --- A2----- )
        */

        int V = 11;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // bfs(graph);

        dfs(graph);
    }
}
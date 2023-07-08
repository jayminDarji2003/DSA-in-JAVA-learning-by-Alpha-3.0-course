/*
    MIX learnings :-
        1. BFS
        2. DFS
*/

import java.util.*;

public class MIX{
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

    // Create graph fnx
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 - vertex 
        graph[0].add(new Edge(0, 1, 5));

        // 1 - vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 - vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 - verted
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 - verted 
        graph[4].add(new Edge(4, 2, 2));
    }

    // BFS fnx
    public static void bfs(ArrayList<Edge> graph[], int src){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[graph.length];
        q.add(src);

        while(!q.isEmpty()){
            int curr = q.remove();
            
            if(!visit[curr]){
                System.out.print(curr + " ");
                visit[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }


    // DFS FNX - Recursive function 
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visit[]){
        // step 1 : curr -> visit
        visit[curr] = true;
        System.out.print(curr + " ");

        // step 2 : neighbour -> visit (recursive call) 
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visit[e.dest]){
                dfs(graph, e.dest, visit);
            }
        }
    }   

    public static void main(String[] args) {
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

        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];  // null -> empty arraylist initialize
        createGraph(graph);

        System.out.println("------- BFS TRAVERSAL output ----------");
        bfs(graph, 0);

        System.out.println("\n------- DFS TRAVERSAL output ---------");
        dfs(graph, 0, new boolean[V]);
    }
}
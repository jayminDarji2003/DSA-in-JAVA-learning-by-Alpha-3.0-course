/*
    BFS (Breadth First Search).
    
    To travers on Graph we have use two approach.
        1. BFS
        2. DFS
        
    Logic of BFS
    step 1:- add src(starting point) to Queue
    step 2:- LOOP - (!q.isEmpty)
                   A) q.remove()--> curr
                   B) if(!visit[curr])
                   i) visit[curr] = true
                        ii) print(curr)
                        iii) add neighbour of curr
*/
package revision.revision_session1;

import java.util.*;

public class BFS {
    // Creating a Graph
    static class Edges {
        int src;
        int dest;
        int wt;

        public Edges(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // create graph fnx
    public static void createGraph(ArrayList<Edges> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edges(0, 1,1));
        graph[0].add(new Edges(0, 2,1));

        graph[1].add(new Edges(1, 0, 1));
        graph[1].add(new Edges(1, 3, 1));

        graph[2].add(new Edges(2, 0, 1));
        graph[2].add(new Edges(2, 4, 1));

        graph[3].add(new Edges(3, 1,1));
        graph[3].add(new Edges(3, 4,1));
        graph[3].add(new Edges(3, 5,1));

        graph[4].add(new Edges(4, 2,1));
        graph[4].add(new Edges(4, 3,1));
        graph[4].add(new Edges(4, 5,1));

        graph[5].add(new Edges(5, 3, 1));
        graph[5].add(new Edges(5, 4, 1));
        graph[5].add(new Edges(5, 6, 1));

        graph[6].add(new Edges(6, 5, 1));
    }

    // bfs fnx
    public static void bfs(ArrayList<Edges> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];

        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                visited[curr] = true;
                System.out.print(curr + " ");
                for(int i=0; i<graph[curr].size(); i++){
                    Edges e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        /*
            Our Graph looks link:
                
                       (0)
                       / \
                      /   \
                    (1)   (2)
                    /       \
                   /         \
                  /           \
                 (3) -------- (4)
                  \           /
                   \         /
                    \       /
                     \     /
                      \   /
                       \ /
                        (5) ------------- (6)


        */

        int V = 7;
        ArrayList<Edges>[] graph = new ArrayList[V];
        createGraph(graph);  // will create a Graph

        bfs(graph);
 }
}

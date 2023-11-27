/*
    BFS (Breadth First Search).

    To travers on Graph we have use two approach.
        1. BFS (Breadth First Search)
        2. DFS (Depth First Search)
    
    Logic of BFS
        step 1:- add src(starting point) to Queue
        step 2:- LOOP - (!q.isEmpty)
                   A) q.remove()--> curr
                   B) if(!visit[curr])
                        i) visit[curr] = true
                        ii) print(curr)
                        iii) add neighbour of curr
*/

import java.util.*;

public class bfs {
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
    public static void createGraph(ArrayList<Edges> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edges(0, 1, 1));
        graph[0].add(new Edges(0, 2, 1));

        graph[1].add(new Edges(1, 0, 1));
        graph[1].add(new Edges(1, 3, 1));

        graph[2].add(new Edges(2, 0, 1));
        graph[2].add(new Edges(2, 4, 1));

        graph[3].add(new Edges(3, 1, 1));
        graph[3].add(new Edges(3, 4, 1));
        graph[3].add(new Edges(3, 5, 1));

        graph[4].add(new Edges(4, 2, 1));
        graph[4].add(new Edges(4, 3, 1));
        graph[4].add(new Edges(4, 5, 1));

        graph[5].add(new Edges(5, 3, 1));
        graph[5].add(new Edges(5, 4, 1));
        graph[5].add(new Edges(5, 6, 1));

        graph[6].add(new Edges(6, 5, 1));
    }

    // bfs fnx
    public static void bfs(ArrayList<Edges>[] Graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[Graph.length];

        int src = 0;
        q.add(src);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                // add neighbors to the queue
                for (int i = 0; i < Graph[curr].size(); i++) {
                    q.add(Graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edges>[] graph = new ArrayList[V];
        createGraph(graph); // will create a Graph

        bfs(graph);
    }
}

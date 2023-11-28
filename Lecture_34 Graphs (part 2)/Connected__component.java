
/*
    Connected Component in Graph:-
*/
import java.util.*;

public class Connected__component {
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

    // create a graph function
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 0, 1));

        // 1 vertex
        // graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 4, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 6, 1));

        // 5 vertex
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 vertex
        graph[6].add(new Edge(6, 4, 1));
        graph[6].add(new Edge(6, 5, 1));

        System.out.println("Graph created successfully");
    }

    // BFS function
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] visit = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                bfsUtil(graph, visit, i);
            }
        }
    }

    // bfsUtil fnx
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visit, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visit[curr]) {
                System.out.print(curr + " ");
                visit[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS algorithm
    public static void dfs(ArrayList<Edge>[] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                dfsUtil(graph, i, visit);
            }
        }
    }

    // dfsUtil fnx
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean visit[]) {
        // visit the vertex
        System.err.print(curr + " ");
        visit[curr] = true;

        // call for neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                dfsUtil(graph, e.dest, visit);
            }
        }
    }

    // has path?
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean visit[]) {
        // src == dest
        if (src == dest) {
            return true;
        }

        visit[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visit[e.dest] && hasPath(graph, e.dest, dest, visit)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        // create a graph function
        createGraph(graph);
        System.out.print("BFS RESULT = ");
        bfs(graph);

        System.out.println();

        System.out.print("DFS RESULT = ");
        dfs(graph);
    }
}

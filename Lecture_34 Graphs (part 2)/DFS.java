import java.util.*;

public class DFS {
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
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

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean[] visit = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                dfsUtil(graph, i, visit);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visit) {
        System.out.print(curr + " ");
        visit[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visit[e.dest]) {
                dfsUtil(graph, e.dest, visit);
            }
        }
    }

    public static void main(String[] args) {
        int V = 11;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        dfs(graph);
    }
}

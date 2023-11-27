// Hash Path.

import java.util.*;

public class hash_path {
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

    // dfs fnx
    public static void dfsTra(ArrayList<Edges>[] Graph, int curr, boolean visit[]) {
        // visit current
        System.out.print(curr + " ");
        visit[curr] = true;

        for (int i = 0; i < Graph[curr].size(); i++) {
            Edges e = Graph[curr].get(i);
            if (!visit[e.dest]) {
                dfsTra(Graph, e.dest, visit);
            }
        }
    }

    // HashPath
    public static boolean hashPath(ArrayList<Edges>[] graph, int src, int dest, boolean visit[]) {
        // base case
        if (src == dest) {
            return true;
        }
        visit[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edges e = graph[src].get(i);

            if (!visit[e.dest] && hashPath(graph, e.dest, dest, visit)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edges>[] graph = new ArrayList[V];
        createGraph(graph); // will create a Graph

        // dfsTra(graph, 0, new boolean[V]);
        System.out.println(hashPath(graph, 0, 5, new boolean[V]));
    }
}

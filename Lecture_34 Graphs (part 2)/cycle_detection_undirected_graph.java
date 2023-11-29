import java.util.*;

public class cycle_detection_undirected_graph {
    // create Edge
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));   // comment this edge to get false
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));   // comment this edge to get false
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // cycle detetion functions
    public static boolean cycleDetection(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (cycleDetectionUtil(graph, vis, i, -1)) {
                    return true;
                    // cycle exits in one of the part.
                }
            }
        }

        return false;
    }

    // actual work here
    public static boolean cycleDetectionUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        // visit current
        vis[curr] = true;

        // call for neighbors.
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // vis[neigh] --> false --> first visit the node.
            if (!vis[e.dest]) {
                if (cycleDetectionUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }

            // vis[neigh] --> true && par --> false --> cycle exits
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }

            // vis[ngigh] --> true && par --> true --> continue
            // do nothing
        }

        return false;
    }

    public static void main(String[] args) {
         /*
            Cycle detection :- 

                    0 --------- 3
                  / |           |
                 /  |           |
                1   |           |
                 \  |           4
                  \ |
                   2
        */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(cycleDetection(graph));
    }
}
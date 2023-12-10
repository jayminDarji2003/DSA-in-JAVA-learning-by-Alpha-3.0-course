import java.util.ArrayList;

public class Articulation_point {
    // Edge class
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
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // targen's algo main code
    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int dt[], int low[], int time, boolean vis[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            // case 1
            if (par == -1) {
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfs(graph, neigh, curr, dt, low, time, vis);
                low[curr] = Math.min(low[curr], low[neigh]);

                if (par != -1 && dt[curr] <= low[neigh]) {
                    System.out.println("AP = " + curr);
                }

                children++;
            }
        }

        if (par == -1 && children > 1) {
            System.out.println("AP = " + curr);
        }

    }

    public static void getArticulationPoints(ArrayList<Edge>[] graph, int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, time, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        getArticulationPoints(graph, v);
    }
}



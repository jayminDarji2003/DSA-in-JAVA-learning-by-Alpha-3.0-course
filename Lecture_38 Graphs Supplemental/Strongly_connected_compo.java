/*
    Strongly connected component:-  
        we will use Kosaraju's algorithm
*/

import java.util.*;

public class Strongly_connected_compo {
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

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    // topological sort
    public static void topSort(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSort(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    // DFS
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }

    }

    public static void kosaraju(ArrayList<Edge> graph[], int V) {
        // step 1
        // perform topological sort and store to stack
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topSort(graph, i, vis, s);
            }
        }

        // step 2
        // create transpose graph (reverse graph)
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // e.src --> e.dest
                transpose[e.dest].add(new Edge(e.dest, e.src)); // reverse edge
            }
        }

        // step 3
        // remove from stack and perfom DFS
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.println("Strongly connected components");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        kosaraju(graph, V);
    }   
}
/*
    Question 1 : Detech a cycle in undirected graph using BFS.
*/

package Assignments;

import java.util.*;

public class q1 {

    static void addEdge(ArrayList<Integer> adj[], int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static boolean isCyclicConntected(ArrayList<Integer> adj[], int s, int V, boolean vis[]) {

        int parent[] = new int[V];
        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        vis[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = 0; i < adj[u].size(); i++) {
                int v = adj[u].get(i);
                if (!vis[v]) {
                    vis[v] = true;
                    q.add(v);
                    parent[v] = u;
                } else if (parent[u] != v) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isCyclicDisconntected(ArrayList<Integer> adj[], int V) {
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);

        for (int i = 0; i < V; i++) {
            if (!vis[i] && isCyclicConntected(adj, i, V, vis)) {
                return true; // Fix: Return true if a cycle is found in any connected component
            }
        }
        return false; // Fix: Return false if no cycle is found in any connected component
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Integer> adj[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);

        if (isCyclicDisconntected(adj, V)) {
            System.out.println("yes, cycle exists in graph");
        } else {
            System.out.println("no, cycle not exists in graph");
        }
    }
}

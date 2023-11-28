import java.util.*;

public class cycle_detection {
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
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }


    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean visit[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visit[i]){
                if(detectCycleUtil(graph, visit,i,-1)){
                    return true;
                    // cycle exits in one of the part.
                }
            }
        }

        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean[] visit,int curr,int par){
        // visit current
        visit[curr] = true;

        // call for neighbors
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            // case 3
            if(!visit[e.dest]){
                if(detectCycleUtil(graph,visit,e.dest,curr)){
                    return true;
                }
            }

            // case 1
            else if(visit[e.dest] && e.dest != par){
                return true;
            }
            // case 2
            // do nothing --> continue;
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

        int V = 11;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
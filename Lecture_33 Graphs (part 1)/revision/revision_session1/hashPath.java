/*
    hasPath : check if the path exist or not
*/

package revision.revision_session1;
import java.util.*;

public class hashPath {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1,1));
        graph[0].add(new Edge(0, 2,1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1,1));
        graph[3].add(new Edge(3, 4,1));
        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 2,1));
        graph[4].add(new Edge(4, 3,1));
        graph[4].add(new Edge(4, 5,1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }


   // hashpath
   public static boolean hashpath(ArrayList<Edge>[] graph,int src, int dest, boolean visit[]){
        
        // case 1
        if(src == dest){
            return true;
        }

        // step 1
        visit[src] = true;

        // step 2
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visit[e.dest] && hashpath(graph, e.dest, dest, visit)){
                return true;
            }
        }

        return false;
   }


    public static void main(String[] args) {
        /*
            Graph:-
                
                  1 --- 3 --
                 /      |    \
                0       |     5 ---- 6
                 \      |    /
                  2 --- 4 --
        */


        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        boolean ans = hashpath(graph, 1, 5, new boolean[V]);
        System.out.println(ans);
    }

}

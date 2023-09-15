package revision.revision_sessin2;
import java.util.*;

public class create_graph {
    // class for Edges
    public class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        // define the graph
        /*
                      (5)
                0 ---------- 1
                            / \
                       (1) /   \ (3)
                          /     \
                         /       \
                        2 ------- 3
                        |    (1)
                        |
                    (2) |
                        |
                        4
        */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        
    }
}

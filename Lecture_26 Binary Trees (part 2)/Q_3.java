/*
    Q.3 :- Top view of a tree.
    --> when we see from top then how many nodes we can see it's called top view of a tree and print nodes.
*/
import java.util.*;
import java.util.spi.CurrencyNameProvider;

public class Q_3{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

        // this fnx print Nodes which is see from top
    public static void topView(Node root){
        // Level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(curr == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(curr);
                }
            }
            else {
                if(!map.containsKey(curr.hd)){ // first time my hd is occuring
                    map.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

            
        }

        // print
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);

    }
}
package REVISION;

import java.time.chrono.IsoEra;
import java.util.*;;

public class Q_3 {
    // create Node
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }


    // create fnx to print --> top view nodes
    public static void topView(Node root){
        // create below things
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0, max = 0;
        
        // level order

        q.add(new Info(root, 0));   // adding --> Node = root and hd = 0;
        q.add(null);
        
        while(!q.isEmpty()){
            Info curr =  q.remove();  // remove current Info
            
            // check for --> null
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                // check for --> normal node
                if(!map.containsKey(curr.hd)){  // "agar key not exists then do"
                    // map.containsKey(curr.hd)
                    // return boolean value; 
                    // true = key exist ; false = key not exist.
                    // first time hd is occurring
                    map.put(curr.hd, curr.node);
                }
            
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd-1);
                }
            
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd + 1 ));
                    max = Math.max(max , curr.hd + 1);
                }
            }
        }
        // print top view nodes
        for(int i = min; i < max ; i++){
            System.out.print(map.get(i).data + " "); // return node and print data of node
        }


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

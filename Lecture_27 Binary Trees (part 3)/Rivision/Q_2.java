/*
    Q.2 :-  Lowest common ancestor
*/

package Rivision;

import java.util.ArrayList;

public class Q_2 {
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

    // Get path fnx 
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        // base case
        if(root == null){
            return false;
        }
        path.add(root);
        
        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path); // call left Subtree
        boolean foundRight = getPath(root.right, n, path); // call right subtree

        if(foundLeft || foundRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }


    // fnx that return node
    // lowest common ancestor
    public static Node lca(Node root,int n1,int n2){
        // To store the Path of the Node
        ArrayList<Node> path1 = new ArrayList<>();  // store N1 path
        ArrayList<Node> path2 = new ArrayList<>();   // store N2 path
        
        // step 1 = cal path
        getPath(root,n1,path1);  // root to n1 path --> store in path1
        getPath(root,n2,path2);  // root to n2 path --> store in path2

        // step 2 = find LCA    
        int i = 0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // last equal node --> i-1th
        Node lca = path1.get(i-1);
        return lca;
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

        int n1 = 4;
        int n2 = 7;

        System.out.println(lca(root, n1, n2).data);
    }
}

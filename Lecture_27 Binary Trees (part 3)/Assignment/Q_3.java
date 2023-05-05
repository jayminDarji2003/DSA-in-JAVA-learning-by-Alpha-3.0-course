/*
    Q.2 :- Delete leaf node with a value as X 
*/
import java.util.*;

public class Q_3 {
    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // delete leaft node with a value as X
    public static Node removeLeafNodes(Node root, int target) {
        //base case
        if(root == null){
            return null;
        }

        // call left subtree
        root.left = removeLeafNodes(root.left ,target);

        // call right subtree
        root.right = removeLeafNodes(root.right , target);

        // check condition and remove data
        if(root.data == target && root.left == null && root.right == null){
            return null;
        }
        
        // return
        return root;
    }


    // level order traversal
    public static void levelOrder(Node root) {
        // base case
        if (root == null) {
            System.out.print("null");
            return ;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            } 
            else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
         * Tree
         * 
                              1
                             / \
                            2   3
                           / \ / \
                          4   5 6 7
         
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(7);

        int X = 4;

        System.out.println("Before");
        levelOrder(root);

        removeLeafNodes(root, X);

        System.out.println("After");
        levelOrder(root);
    }
}

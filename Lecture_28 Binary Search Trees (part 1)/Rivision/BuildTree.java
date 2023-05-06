/*
    Build a Binary Search Tree.
*/

package Rivision;
public class BuildTree {
    // Structure of node
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

    // insert fnx that insert value in BST 
    public static Node insert(Node root, int val){
        // when our root is null
        if(root == null){
            root = new Node(val);
            return root;
        }

        // when our root is not null then find position to insert
        // case 1
        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }
        // case 2
        else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        // base case
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Node array
        int nodes[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;

        for(int i=0; i<nodes.length; i++){
            root = insert(root, nodes[i]);
        }

        // print tree
        inorder(root);
    }
}

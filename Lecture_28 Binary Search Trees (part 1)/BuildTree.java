// Build Binary search tree

public class BuildTree {
    // define structure of node
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // insert fnx
    public static Node insert(Node root , int val){
        // base case
        if(root == null){
            root = new Node(val);
            return root;
        }

        // case 1
        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val); 
        }

        // case 2
        if(root.data < val){
            // right subtree
            root.right = insert(root.right, val);
        }

        // in the end return
        return root;
    }

    // inorder traversal
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
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        // print tree (inorder traversal)
        inorder(root);

    }
}
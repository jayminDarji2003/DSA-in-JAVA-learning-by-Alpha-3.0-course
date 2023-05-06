package Rivision;

public class build_Tree {
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

    // fnx
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            root.right = insert(root.right, val);
        }
        else{
            root.left = insert(root.left, val);
        }

        return root;
    }

    // print tree fnx
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
        int nodes[] = { 5, 2, 1, 4, 6, 9, 8, 7, 3, 10 };
        Node root = null;

        for(int i=0; i<nodes.length ; i++){
            root = insert(root, nodes[i]);
        }

        // print tree
        inorder(root);
    }
}

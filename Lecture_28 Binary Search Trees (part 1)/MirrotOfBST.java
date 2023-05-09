/*
    Q :- Mirror of BST. (Inverted binary search tree).
*/

public class MirrotOfBST {
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

    // Mirror of BST fnx
    public static Node mirror(Node root){  // TC O(n)
        // termination condition / base case
        if(root == null){
            return null;
        }

        // call left subtree
        Node leftMirror = mirror(root.left);

        // call right subtree
        Node rightMirror = mirror(root.right);

        // logic
        root.left = rightMirror;
        root.right = leftMirror;

        // return root
        return root;
    }

    // print tree (preorder traversal)
    public static void preorder(Node root){
        // base case
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
      /*
            Tree will be

                            8
                           /  \
                          5    10
                         / \    \
                        3   6    11


            expected mirror BST 
                            8
                           /  \
                          10   5
                         /    /  \
                        11   6    3
            */
            Node root = new Node(8);
            root.left = new Node(5);
            root.right = new Node(10);
            root.left.left = new Node(3);
            root.left.right = new Node(6);
            root.right.right = new Node(11);

            System.out.println("Original tree");
            preorder(root);

            root = mirror(root);

            System.out.println("\nMirror tree");
            preorder(root);
    }
}

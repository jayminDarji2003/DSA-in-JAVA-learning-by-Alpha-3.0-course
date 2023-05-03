/*
    Q.6 :- Transform to sum tree          
*/

public class Q_6 {
    // create node
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

    // sum tree fnx
    public static int transform(Node root){
        // base case
        if(root == null){
            return 0;
        }

        // call left subtree
        int leftChild = transform(root.left);

        // call right subtree
        int rightChild = transform(root.right); 

        int data = root.data;

        int newLeft = root.left == null ? 0 :  root.left.data ;
        int newRight = root.right == null ? 0 :  root.right.data ;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;    
    }

    // print tree (preorder fnx)
    public static void printTree(Node root){
        // base case 
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");  // print root data
        printTree(root.left);   // call left subtree 
        printTree(root.right);  // call right subtree
    }


    public static void main(String[] args) {
        /*
            -> Original tree

                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7          
       

            -> Expected tree after sum

                    27
                   / \
                  9   13
                 / \ / \
                0  0 0  0          
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        printTree(root);
    }
}

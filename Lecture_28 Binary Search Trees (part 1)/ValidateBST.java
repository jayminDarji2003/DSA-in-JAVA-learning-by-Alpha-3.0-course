/*
    Q :- Validate BST
        check if a BST is valid by it's property or not
    
    Approach 1
        - Calculate INORDER TRAVERSAL
            - if INORDER TRAVERSAL is sorted --> valid
            - else --> not valid
    
    Approach 2
        check if : MAX VALUE IN LEFT SUBTREE < NODE
            AND
        check if : MIN VALUE IN RIGHT SUBTREE > NODE

*/

public class ValidateBST {
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

    // VALID FNX CKECK
    public static boolean isValidBST(Node root, Node min, Node max) {
        // termination condition / base case
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
            /*
            Tree will be

                             8
                           /  \
                          5    10
                         / \    \
                        3   6    11
                                  \
                                  14  
            */


        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        if(isValidBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
    }
}

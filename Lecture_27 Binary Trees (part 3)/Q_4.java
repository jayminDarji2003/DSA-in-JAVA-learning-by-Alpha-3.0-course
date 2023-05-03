/*
    Q.4 :- Min Distance Between nodes.

    Approach   TC = O(n)
        1. find LCA 
        2. path1 = LCA to N1  --> dist1
        2. path2 = LCA to N2  --> dist2
        3. minDist = path1 + path2
*/

public class Q_4 {
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

    // cal LCA (helper fnx)
    public static Node lca(Node root,int n1,int n2){
        // base cases 
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        // call left subtree
        Node leftLca = lca(root.left, n1, n2);

        // call right subtree
        Node rightLca = lca(root.right, n1, n2);

        // leftLca == val   but  rightLca == null
        if(rightLca == null){
            return leftLca;
        }

        // rightLca == val  but  leftLca == null
        if(leftLca == null){
            return rightLca;
        }

        // if both return value (leftLca and rightLca)
        return root;
    }

    // find LCA to n distance (helper fnx)
    public static int lcaDist(Node root,int n){
        // base case
        if(root == null){
            return -1;
        }

        // if match to root
        if(root.data == n){
            return 0;
        }

        // call left subtree
        int leftDist = lcaDist(root.left, n);

        // call right subtree
        int rightDist = lcaDist(root.right, n);

        // both return -1 
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        // leftDist return -1
        else if(leftDist == -1){
            return rightDist + 1;
        }
        // rightDist return -1
        else {
            return leftDist + 1;
        }
    }

    // main fnx : min distance find
    public static int minDist(Node root,int n1, int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca,n1);
        int dist2 = lcaDist(lca,n2);
        return dist1 + dist2;
    }


    public static void main(String[] args) {
        /*
                     1
                    /\
                   2  3
                  /\  /\
                 4  5 6 7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 6;
        System.out.println("Mininum Distance between two nodes is :- " + minDist(root, n1, n2));
    }
}

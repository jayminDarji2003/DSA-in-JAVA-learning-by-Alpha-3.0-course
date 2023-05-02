/*
    Q.1 :- kth Level of a tree.
        -> Print all the node which is comes in Kth Level

    There are two approach to solve this question
        1. Iterative approach --> using level order traversal
        2. Recursive approach --> using recursion
*/

class Q_1{
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

    // Approach 1 --> Recursive method
    public static void KLevel(Node root, int level, int k){
        //base case
        if(root == null){
            return;
        }

        // check level and k is same or not
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        // call for left subtree
        KLevel(root.left, level+1, k);
        // call for right subtree
        KLevel(root.right, level+1, k);
    }


    public static void main(String[] args){
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

        int K = 3;

        KLevel(root, 1, K);
    }
}
/*
     Q_1 :- check if a binary tree is univalued or not
        Time Complexity O(n)
        Space Complexity O(1)
 */

import java.lang.invoke.LambdaMetafactory;
import java.rmi.dgc.Lease;

public class Q_1 {
    // create Node
    static class Node{
        int data;
        Node left;
        Node right;

        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // main fnx
    public static boolean isUnivalTree(Node root){
        // base case
        if(root == null || root.left == null || root.right == null){
            return true;
        }

        // if left subtree data are not same as root data
        if(root.data != root.left.data){
            return false;
        }

        // if right subtree data are not same as root data
        if(root.data != root.right.data){
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }

    public static void main(String[] args) {
        /*
            out tree will be
            
                        1
                       / \
                      2   3
                     / \  / \ 
                    4   5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        System.out.println(isUnivalTree(root));
    }
}
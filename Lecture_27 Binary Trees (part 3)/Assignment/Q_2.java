/*
    Q.2 :- Inverted Binary Tree.
        when we see the tree in mirror how it looks its called inverted binary tree. 
*/

import java.util.LinkedList;
import java.util.Queue;

public class Q_2 {
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

    // approach 
    public static Node invertTree(Node root) {
        if (root == null)
            return root;
        invertTree(root.left);
        invertTree(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }

    // Level order traversal
    public static void levelOrder(Node root) {
        // base case
        if (root == null) {
            return;
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
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        /*
         * Tree
         * 
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         * Expected Tree will be
         * 
         * 1
         * / \
         * 3 2
         * / \ / \
         * 7 6 5 4
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Our original tree looks like!!");
        levelOrder(root);
         invertTree(root);
        System.out.println("\nOur Mirror tree will be!!");
        levelOrder(root);
    }
}

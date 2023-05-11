/*
    Q.1:- find sum of range in BST.
*/
import java.util.*;

public class Q_1_way2 {
    // create Node structure
    static class Node{
        int val;
        Node left, right;

        public Node(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    static int sum = 0;

    // range sum
    static int rangeSumBST(Node root,int low,int high){
        // termination condition
        if(root == null) return 0;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(q.isEmpty() == false){
            Node curr = q.peek();
            q.remove();

            if(curr.val >= low && curr.val <= high){
                sum += curr.val;
            }
            if(curr.left != null && curr.val > low){
                q.add(curr.left);
            }
            if(curr.right != null && curr.val < high){
                q.add(curr.right);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Tree will be

                    10
                    / \
                   5   15
                  / \    \
                 3   7    18
        */
        // creating tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        System.out.println(rangeSumBST(root, 5, 15));
    }
}

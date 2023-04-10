/*
    Sum of Nodes    
*/

public class SumOfNodes {
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

    //Sum of nodes
    public static int sum(Node root){
       // base case
       if(root == null){
            return 0;
       }

       int leftSum = sum(root.left);
       int rightSum = sum(root.right);
       int treeSum = leftSum + rightSum + root.data;

       return treeSum;
    }

    public static void main(String[] args) {
        /*
            Tree:-
            
                     1
                   /   \
                  2     3
                 / \   / \
                4   5 6   7 
        */


        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sum(root));
    }
}
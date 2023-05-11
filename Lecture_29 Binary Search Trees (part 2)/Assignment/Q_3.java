/*
    Q.3:- Find Kth smalles element.

        Time Complexity : O(n)
        Space Complexity : O(h)
*/

public class Q_3 {
    //create node structure
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int count = 0;

    // kth smallest node fnx
    public static Node kthSmallest(Node root,int k){
        // base case
        if(root == null){
            return null;
        }

        Node left = kthSmallest(root.left, k);

        if(left != null){
            return left;
        }
        count++;
        if(count == k){
            return root;
        }

        return kthSmallest(root.right, k);
    }

    // print kth smallest
    public static void printKthSmallest(Node root,int k){
        Node res = kthSmallest(root, k);
        if(res == null){
            System.out.println("There are less than k nodes in the BST.");
        }else{
            System.out.println("Kth smalles element is = " +res.data);
        }
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

        int k = 6;
        printKthSmallest(root, k);
    }
}

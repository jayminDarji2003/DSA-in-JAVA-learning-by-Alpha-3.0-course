public class Q_5 {
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

    // fnx
    public static int kAncestor(Node root, int n, int k){
        // base case
        if(root == null){
            return -1;
        }

        //check with node itself
        if(root.data == n){
            return 0;  // if match this condition then return 0 as distance
        }

        // call for left subtree
        int leftDist = kAncestor(root.left, n, k);

        // call for right subtree
        int rightDist = kAncestor(root.right, n, k);

        // if node are note ancestor
        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        //print if node exits in subtree
        if(max+1 == k){
            System.out.println("Ancestor is : " + root.data);
        }

        return max+1;
    }


    public static void main(String[] args) {
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

        int n = 5, k = 2;
        kAncestor(root, n, k);
    }
}

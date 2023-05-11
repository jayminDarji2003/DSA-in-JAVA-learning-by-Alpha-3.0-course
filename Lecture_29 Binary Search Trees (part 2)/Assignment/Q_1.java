/*
    Q.1 :- Print sum in range.

        Time Complexity O(n)
        Space Complexity O(n)
*/

public class Q_1 {
    // node structure
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

    // sum of range
    public static int rangeSumBST(Node root,int low, int high){
        // base case
        if(root == null) return 0;

        int sum = 0;

        if(root.data >= low && root.data <= high){
            sum += root.data;
        }
        if(root.data > low ){
            sum += rangeSumBST(root.left, low, high);
        }
        if(root.data < high){
            sum += rangeSumBST(root.right, low, high);
        }
        
        // in the end return
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
/*
    Q.2 :- Find the closest element in the binary search tree.
        Time Complexity = O(h)
        Space Complexity = O(1)
*/

public class Q_2 {
    static int min_diff;
    static int min_diff_key;

    static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    // fnx
    static void maxDiffUnit(Node root,int k){
        // termination condition
        if(root == null)  return;

        if(root.key == k){
            min_diff_key = k;
        }
        
        if(min_diff > Math.abs(root.key - k)){
            min_diff = Math.abs(root.key - k);
            min_diff_key = root.key;
        }

        if(k < root.key){
            maxDiffUnit(root.left, k);
        }else{
            maxDiffUnit(root.right, k);
        }
    }

    // max diff fnx
    static int maxDiff(Node root,int k){
        min_diff = 999999999;
        min_diff_key = -1;
        maxDiffUnit(root, k);
        return min_diff_key;
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

        System.out.println(maxDiff(root, 17));
    }
}

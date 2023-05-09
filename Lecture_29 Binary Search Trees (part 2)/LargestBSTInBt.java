/*
    Q.3 :- Size of Largest BST in BT

    -> find the largest size of BST in BT.
*/

public class LargestBSTInBt {
    // Node structure
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

    // class for storing information of any node
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;
     

    //cal fnx
    public static Info largestBST(Node root){
        // base case
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left); // call for left subtree
        Info rightInfo = largestBST(root.right); // call for right subtree

        // cal size
        int size = leftInfo.size + rightInfo.size + 1;

        // cal min value
        int min = Math.min(Math.min(leftInfo.min, rightInfo.min), root.data);
        
        // cal min value
        int max = Math.max(Math.max(leftInfo.max, rightInfo.max), root.data);

        // cal ifBST
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST, size); 
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        /*
            -> Our tree will be
            -> GIVEN BT
            
                        50
                      /    \
                     30    60
                    / \    / \
                   5  20  45  70
                              / \
                            65   80

            -> expected BST:size - 5;
            
                      60
                      / \
                     45  70
                         / \
                       65   80
        */

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);

        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right.left = new Node(45);
        root.right.right = new Node(70);

        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largestBST(root);
        System.out.println("largest BST size : " + maxBST);

        System.out.println("Also Tree is BST : " + info.isBST);
    }
}

package REVISION;

public class Q_1 {
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


    // Approach 1 O(n^2)

    // ht fnx
    public static int ht(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int leftht = ht(root.left);
        int rightht = ht(root.right);
        return leftht + rightht + 1;
    }

    // diameter fnx
    public static int diameter(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int leftDiam = diameter(root.left);  // return diameter of left subtree
        int leftHt = ht(root.left);   // return left subtree ht

        int rightDiam = diameter(root.right);  // return diameter of right subtree
        int rightHt = ht(root.right);   // return right subtree ht

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }


    // Approach 2 O(n)


    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root){
        // base case
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam) , leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;

        return new Info(diam, ht);
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

        System.out.println("Diameter is = " + diameter2(root).diam);
    }
}

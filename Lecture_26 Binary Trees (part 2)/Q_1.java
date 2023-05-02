/*
    Q.1 :- Diameter of a tree
            Approach 1 ==> O(n^2)
            Approach 2 ==> O(n)
*/
class Q_1{
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

    //height fnx
    public static int height(Node root){
        // base case
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh, rh) + 1;
        
        return height;
    }

    // Finding Diameter (Approach 1) 
    public static int diameter(Node root){  // O(n^2)
        // base case
        if(root == null){
            return 0;
        }

        // find 4 things : ld, lh, rd, rh
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;

        return Math.max(selfDiam,Math.max(leftDiam, rightDiam));
    }

    // Finding Diameter (Approach 2)

    static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root){   // O(n)
        // base case
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        // calculte Diameter
        // first of all find max of --> leftInfo.diam , rightInfo.diam
        // after that find max of ----> previous max , selfDiam
        int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam ), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

        return new Info(diam,ht);
    }

    public static void main(String[] args){
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

        System.out.print("Diameter = " );
        System.out.println(diameter2(root).diam);
    }
}
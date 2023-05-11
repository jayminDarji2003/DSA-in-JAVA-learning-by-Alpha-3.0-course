/*
    Q.5 :- Maximum sum in BST in Binary Tree.

        Time complexity : O(n)
        Space complexity : O(n)
*/

public class Q_5 {
    // Node structure
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

    static class Info{
        int max;
        int min;
        boolean isBST;
        int sum;
        int currMax;

        public Info(int m,int mi,boolean is,int su,int curr){
            max = m;
            min = mi;
            isBST = is;
            sum = su;
            currMax = curr;
        }

        public Info() {}
    }

    static class INT{
        int a;
    }

    // fnx
    static Info maxSumBSTUnit(Node root,INT maxSum){
        if(root == null){
            return new Info(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0,0);
        }
        
        if(root.left == null && root.right == null){
            maxSum.a = Math.max(maxSum.a, root.data);
            return new Info(root.data,root.data,true,root.data,maxSum.a);
        }

        Info L = maxSumBSTUnit(root.left, maxSum);
        Info R = maxSumBSTUnit(root.right, maxSum);

        Info BST = new Info();

        if(L.isBST && R.isBST && L.max < root.data && R.min > root.data){
            BST.max = Math.max(root.data,Math.max(L.max, R.max));
            BST.min = Math.min(root.data,Math.max(L.min, R.min));

            maxSum.a = Math.max(maxSum.a,R.sum + root.data + L.sum);
            BST.sum = R.sum + root.data + L.sum;
            BST.currMax = maxSum.a;
            BST.isBST = true;
            return BST;
        }

        BST.isBST = false;
        BST.currMax = maxSum.a;
        BST.sum = R.sum + root.data + L.sum;
        return BST; 
    }

    //max sum bst fnx
    static int maxSumBST(Node root){
        INT maxSum = new INT();
        maxSum.a = Integer.MIN_VALUE;
        return maxSumBSTUnit(root, maxSum).currMax;
    }


    public static void main(String[] args) {
        // creating tree
        Node root = new Node(5);
        root.left = new Node(14);   
        root.right = new Node(3);

        root.left.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(9);
        root.left.left.right = new Node(1);

        System.out.println(maxSumBST(root));
    }
}

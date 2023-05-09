/*
    Q.1 :- Sorted Array to Balanced BST.

        -> convert sorted array to BST.
        -> We all know that inorder sequence of BST is sorted.
*/


public class SortedArrayToBST {
    // create Node
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
    public static Node createBST(int arr[],int st,int end){
        // base case
        if(st > end){
            return null;
        }

        // cal mid
        int mid = (st+end) / 2;

        // create new node
        Node root = new Node(arr[mid]);

        // call left subtree
        root.left = createBST(arr, st, mid-1);

        // call right subtree
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    // preorder traversal
    public static void preorder(Node root){
        // base case
        if(root == null){
            return ;
        }

        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
        /*
            expected tree will be
            
                         8
                       /   \
                      5    11
                     / \   / \
                    3   6 10 12

        */
        Node root = createBST(arr, 0, arr.length-1);
        System.out.println(root.data);
        preorder(root);
    }
}
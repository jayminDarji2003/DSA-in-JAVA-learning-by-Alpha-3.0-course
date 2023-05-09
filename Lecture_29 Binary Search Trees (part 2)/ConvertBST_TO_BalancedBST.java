/*
    Q.2 :- convert BST to balanced BST.     
*/

import java.util.ArrayList;

public class ConvertBST_TO_BalancedBST {
    // node class
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

    // inorder fnx
    public static void inorder(Node root,ArrayList<Integer> arr){
        // base case
        if(root == null){
            return ;
        }

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    // build Balanced BST fnx
    public static Node buildBST(ArrayList<Integer> arr,int st, int end){
        // base case
        if(st > end){
            return null;
        }

        // cal mid
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));

        root.left = buildBST(arr, st, mid-1);
        root.right = buildBST(arr, mid+1, end);

        return root;
    }

    // preorder fnx
    public static void inorder(Node root){
        // base case
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        /*
            tree will be
            
                            8
                           / \
                          6   10
                         /     \
                        5       11
                       /          \
                      3            12
        */

        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);

        root.left.left = new Node(5);
        root.right.right = new Node(11);

        root.left.left.left = new Node(3);
        root.right.right.right = new Node(12);

        ArrayList<Integer> arr = new ArrayList<>();

        inorder(root,arr);

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        Node root2 = buildBST(arr, 0, arr.size()-1);
        System.out.println("\nbalanced tree");
        inorder(root2);
    }
}
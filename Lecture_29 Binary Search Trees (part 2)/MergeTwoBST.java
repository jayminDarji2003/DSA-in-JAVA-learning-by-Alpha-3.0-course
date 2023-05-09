/*
    Q.4 :- Merge two BSTs.

    way 1

    -> to merge two bst in a single bst.
  
*/

import java.util.*;

public class MergeTwoBST {
    // create node structure
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

    // store nodes in arraylist
    public static void setBSTNodes(Node root,ArrayList<Integer> arr){
        // base case
        if(root == null){
            return;
        }

        setBSTNodes(root.left, arr);
        arr.add(root.data);
        setBSTNodes(root.right, arr);
    }

    // print arraylist 
    public static void printAL(ArrayList<Integer> arr){
        for(int i=0; i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    // build BST
    public static Node buiNodeBST(ArrayList<Integer> aList, int st, int end){
        //base case
        if(st > end){
            return null;
        }

        int mid = (st+end) / 2;
        Node root = new Node(aList.get(mid));
        root.left = buiNodeBST(aList, st, mid-1);
        root.right = buiNodeBST(aList, mid+1, end);

        return root;
    }

    // inorder tree
    public static void inorder(Node root){
        // base case
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        /*
            BST1
                    2
                   / \
                  1   4
            
            BST2
                    9
                   / \
                  3   12


            expected tree will be :

                         3
                       /  \
                      1    9
                      \   / \
                       2  4 12
        */

        // BST1
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        // BST2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        // creare Arraylist
        ArrayList<Integer> treeNode = new ArrayList<>();

        // call setBSTNodes fnx
        setBSTNodes(root, treeNode);
        setBSTNodes(root2, treeNode);

        Collections.sort(treeNode);

        // pring arraylist fnx
        System.out.println("printing arraylist values");
        printAL(treeNode);

        Node newRoot = buiNodeBST(treeNode, 0, treeNode.size()-1);

        // print tree
        System.out.println("\nprint BST inorder sequence");
        inorder(newRoot);
    }
}

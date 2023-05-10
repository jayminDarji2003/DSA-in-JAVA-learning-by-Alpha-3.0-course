/*
    AVL tree :-
*/

import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class AVL_tree {
    // Node structure
    static class Node{
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            height = 1;
            this.left = null;
            this.right = null;
        }
    }

    public static Node root ;

    // height fnx
    public static int height(Node root){
        // base case
        if(root == null){
            return 0;
        }
        
        return root.height;
    }

    // max fnx
    static int max(int a, int b){
        return (a > b) ? a : b;
    }

    // get balance fnx
    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    // Left rotate subtree rooted with x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        // perform rotation
        y.left = x;
        x.right = T2;

        // update height
        x.height = max(height(x.left), height(x.right) + 1);
        y.height = max(height(y.left), height(y.right) + 1);

        // return new root
        return y;
    }

    // Right rotate subtree rooted with y
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;

        // perform operation
        x.right = y;
        y.left = T2;

        // update height
        y.height = max(height(y.left), height(y.right) + 1);
        x.height = max(height(x.left), height(x.right) + 1);

        // return new node
        return x;
    }

    // insert fnx
    public static Node insert(Node root,int key){
        // base case
        if(root == null){
            return new Node(key);
        }

        if(key < root.data){
            root.left = insert(root.left, key);
        }
        else if(key > root.data){
            root.right = insert(root.right, key);
        }
        else{
            return root; // duplicate root are not allowed
        }

        // update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get roots balance factor
        int bf = getBalance(root);

        // Left Left case
        if(bf > 1 && key < root.left.data){
            return rightRotate(root);
        }

        // Right Right case
        if(bf < -1 && key > root.right.data){
            return leftRotate(root);
        } 

        // Left Right case
        if(bf > 1 && key > root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        //Right Left case
        if(bf <  -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // returned if AVL balanced
    }

    // preorder tree fnx
    public static void preorder(Node root){
        // base case
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        /*
                AVL Tree

                    30
                   /  \
                  20  40
                 / \    \
                10  25   50
        */

        preorder(root);
    }
}
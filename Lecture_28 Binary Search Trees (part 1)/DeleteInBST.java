/*
    Delete node in BST

    when we want to delete node in BST, we follow three cases
        case 1 :- delete : child node (leaf node)
        case 2 :- delete : one child
        case 3 :- delete : two child

    explain
        case 1 :-
            leaf node = null --> this node will be delete
        
        case 2 :-
            root.left = root.left.left
                or
            root.right = root.right.right

        case 3 :-
            find Inorder Successor (IS)
                IS :- Left most node  in right subtree (min value in right subtree)
            key = IS  --> key means the node we want to delete
            IS delete

*/

import javax.xml.transform.Source;

public class DeleteInBST {
    // create Node structure
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

    // insert fnx that insert values in a BST   
    public static Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    // print tree - inorder traversal
    public static void inorder(Node root){
        // base case
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    // delete fnx
    public static Node delete(Node root,int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // voila  --> we found our node

            // case 1 --> leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 --> one(single) child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }


            // case 3 --> both(two chlid) child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // find inorder successor 
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }



    public static void main(String[] args) {
        /*
            Tree will be:-

                    8
                   / \
                  5   10
                 / \    \
                3   6    11
               / \         \ 
              1   4         14
          
        */
        // Nodes
        int nodes[] = { 8, 5, 3, 6, 1, 4, 10, 11, 14 };
        Node root = null;

        // building a tree
        for(int i=0; i<nodes.length; i++){
            root = insert(root,nodes[i]);
        }

        // print tree
        System.out.println("The tree node are : ");
        inorder(root);
        System.out.println();

        root = delete(root, 1);
        System.out.println();

        inorder(root);
    }
}

/*
    Delete node
*/

package Rivision;

public class DeleteNode {
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


    // Delete Node fnx
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{ // voila  --> where we found our node
            // case 1 -> leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 -> single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3 -> two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // Inorder successor fnx
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
        
        root = delete(root, 5);

        // print tree
        System.out.println("The tree node are : ");
        inorder(root);
        System.out.println();
    }
}

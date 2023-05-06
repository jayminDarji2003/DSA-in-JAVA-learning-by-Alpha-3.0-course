/*
    Search key in a BST
*/

public class SearchInBST {
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

    // search in BST fnx
    public static boolean search(Node root,int key){
        // base case
        if(root == null){
            return false;
        }

        // if key found
        if(root.data == key){
            return true;
        }

        // case 1
        if(root.data > key){
            return search(root.left, key);
        }
        
        // case 2
        else{
            return search(root.right, key);
        }
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

        // search BST   
        if(search(root, 19)) 
            System.out.println("found");
        else    
            System.out.println("not found");
    }
}

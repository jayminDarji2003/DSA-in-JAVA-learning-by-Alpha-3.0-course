/*
    Q :- print Root to Leaf Path
*/

import java.util.ArrayList;

public class PrintRootToLeafPath {
     // Node class
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

    // print path fnx
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    // fnx that print root to leaf paths
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        // base case
        if(root == null){
            return;
        }

        // step 1 : add node to arraylist
        path.add(root.data);

        // --> print path
        if(root.left == null && root.right == null){
            printPath(path);
        }

        // step 2 : left subtree call
        printRoot2Leaf(root.left, path);

        // step 3 : right subtree call
        printRoot2Leaf(root.right, path);

        // remove data in arraylist while backtrack
        path.remove(path.size()-1);

    }

    public static void main(String[] args) {
        /*
            Tree will be

                             8
                           /  \
                          5    10
                         / \    \
                        3   6    11
                                  \
                                  14  
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right =  new Node(11);
        root.right.right.right = new Node(14);

        ArrayList<Integer> path = new ArrayList<>();

        printRoot2Leaf(root, path);
    }
}

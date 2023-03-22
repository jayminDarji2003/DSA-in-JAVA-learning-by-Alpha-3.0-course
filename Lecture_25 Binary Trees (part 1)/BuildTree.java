
/*
    Building a Preorder tree
    Time Complexity = O(n)
*/
import java.util.*;

class BuildTree {
    // creating Node class
    // Node class is used to create NODE
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // creating BinaryTree class
    //Binary tree is used to joing or create tree
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){    
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            //create new node
            Node newNode = new Node(nodes[idx]);

            //create left subtree
            newNode.left = buildTree(nodes);

            //create right subtree
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("root node is " + root.data);
    }
}
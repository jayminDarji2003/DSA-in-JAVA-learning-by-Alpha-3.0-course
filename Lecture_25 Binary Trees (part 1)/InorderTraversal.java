/*
    Inorder traversal

    rule :-
        1. left subtree
        2. root
        3. right subtree

*/

class InorderTraversal {
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

    static class BinaryTree {
        static int idx = -1;

        // build tree fnx
        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public void inorder(Node root){
            // base case
            if(root == null){
                return;
            }

            inorder(root.left); // print left subtree
            System.out.print(root.data + " "); // print root
            inorder(root.right); // print right subtree
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.inorder(root);
    }
}

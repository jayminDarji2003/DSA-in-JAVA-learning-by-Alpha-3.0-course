/*
    Postorder traversal

    rule :-
        1. left subtree
        2. right subtree
        3. root

*/

class PostorderTraversal {
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

        public void postorder(Node root){
            //base case
            if(root == null){
                return;
            }
            
            postorder(root.left);   // left subtree
            postorder(root.right);  // right subtree
            System.out.print(root.data + " ");  // root data
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.postorder(root);
    }
}

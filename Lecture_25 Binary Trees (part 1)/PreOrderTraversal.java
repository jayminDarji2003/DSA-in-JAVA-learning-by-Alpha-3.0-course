/*
    Preorder traversal

    rule :-
        1. root
        2. left subtree
        3. right subtree

*/

class PreOrderTraversal {
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
    static class BinaryTree{
        static int idx = -1;

        //build tree fnx
        public Node buildTree(int nodes[]){    
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // preorder traversal fnx
        public void preorder(Node root){   //O(n)
            // base case
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");  // print root data
            preorder(root.left);    // print left subtree
            preorder(root.right);   // print right subtree
            
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preorder(root);
    }
}

/*
    Q = check both tree is identical or not.
*/

package REVISION;

public class Q_2 {
    // Creating Node
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

    // check subtree or tree identical fnx
    public static boolean isSubtree(Node root, Node subRoot){
        // base case
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        // call for left subtree
        boolean leftAns = isSubtree(root.left, subRoot);

        // call for right subtree
        boolean rightAns = isSubtree(root.right,subRoot);

        return leftAns || rightAns;  // return true --> 1.one true  2. both true
                                    // return false --> both are false
    } 


    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null){
            return false;
        }
        else if(node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){   // left subtree return false then.
            return false;            
        }

        if(!isIdentical(node.right, subRoot.right)){   // left subtree return false then.
            return false;            
        }
        return true;
    }


    public static void main(String[] args) {
        /*
            -> main tree

                         1
                       /   \
                      2     3
                     / \   / \
                    4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        /*
            -> sub tree
                        
                             2
                            / \
                           4   5
        */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
       subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));

        // just extra information 
        // don't ask in question 
        if(isSubtree(root, subRoot)){
            System.out.println("Trees are identical each other");
        }else{
            System.out.println("Trees are not identical with each other");
        }
    }   
}

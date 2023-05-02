/*
    Q.1 :- Kth level of a tree. 
        -> print all the node which is comming at the kth level.
*/

package Rivision;

import java.util.*;

public class Q_1 {
    // creating Node
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

    // Approach 1 -> Recursion use
    public static void kLevel(Node root,int level,int k){
        // base case
        if(root == null){
            return;
        }

        //check level
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        // call left subtree
        kLevel(root.left, level+1, k);

        // call right subtree
        kLevel(root.right, level+1, k);
    }



    // Approach 2 --> level order traversal
    public static void kLevel2(Node root,int level,int k){
        // base case
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

       while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    level++;
                }
            }
            else{
                if(level == k){
                    System.out.print(curr.data + " ");
                }

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
       }

    }

    public static void main(String[] args) {
         /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7          
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        System.out.println("Kth level print approach 1");
        kLevel(root, 1, k);
        System.out.println();

        System.out.println("Kth level print approach 2");
        kLevel2(root, 1, k);
    }
}

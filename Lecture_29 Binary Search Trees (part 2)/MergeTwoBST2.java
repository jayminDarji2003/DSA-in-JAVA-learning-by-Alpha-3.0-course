/*
    Q.4 :- Merge two BST into a sinlge BST.

    WAY 2
    
*/

import java.util.ArrayList;

public class MergeTwoBST2 {
     // create node structure
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

    // get inorder fnx
    public static void getInorder(Node root,ArrayList<Integer> arr){
        // base case
        if(root==null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    // bst
    public static Node createBST(ArrayList<Integer> arr, int st, int end){
        // base case 
        if(st > end){
            return null;
        }

        int mid = (st+end) / 2;
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    // merge BST fnx
    public static Node mergeBSTs(Node root1,Node root2){
        //step 1 : cal inorder seq for root1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        //step 1 : cal inorder seq for root2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);
        
        // step 3 : merge two arraylist 
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i < arr1.size() && i < arr2.size()){ // compare two arraylist value and store
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        // remaining value of arr1 storing
        while(i < arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        // remaining value of arr2 storing
        while(j < arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }


        // step 4 : sorted arraylist to balanced BST
        Node root = createBST(finalArr, 0, finalArr.size()-1);

        // return root
        return root;
    }

    // preorder fnx
    public static void preorder(Node root){
        // base case
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
         /*
            BST1
                    2
                   / \
                  1   4
        */
        // BST1
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        
        /* 
        BST2
                            9
                           / \
                          3   12
        
        */
        // BST2
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
            expected tree will be :

                         3
                       /  \
                      1    9
                      \   / \
                       2  4 12
        */
        
        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}

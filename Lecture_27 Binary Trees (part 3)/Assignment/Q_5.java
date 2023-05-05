/*
    Q.5 :- Max path sum in a Binary tree.

    Time complexity O(n)
    Space complexity O(1)
*/


public class Q_5 {
    
    // create node class
    static class Node{
        int data;
        Node left, right;

        public Node(int item){
            data = item;
            left = right = null;
        }
    }

    static class Res{
        public int val;
    }

    static class Solution{
        public Solution(){}
        Node root;

        int findMaxUtil(Node node,Res res){
            // base case
            if(node == null){
                return 0;
            }

            int Left = findMaxUtil(node.left, res);
            int right = findMaxUtil(node.right, res);

            int max_single = Math.max(Math.max(Left, right) + node.data , node.data);
            int max_top = Math.max(max_single, Left + right + node.data);

            res.val = Math.max(res.val, max_top);

            return max_single;
        }

        int findMaxSum(){
            return findMaxSum(root);
        }

        int findMaxSum(Node root){
            Res res = new Res();
            res.val = Integer.MIN_VALUE;

            findMaxUtil(root, res);
            return res.val;
        }
    }



    public static void main(String[] args) {
          /*
         * Tree
         * 
                              1
                             / \
                            2   3
                           / \ / \
                          4   5 6 7
         
         */

        Solution tree = new Solution();

        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);

        tree.root.right.right = new Node(-25);
        tree.root.right.right.left   = new Node(3);
        tree.root.right.right.right   = new Node(4);

        System.out.println("Max path sum is : " + tree.findMaxSum());
    }
}

/*
    Q.4 :- find duplicate in a binary tree

    Note :- I have right just fnx that find duplicate in a binary tree and i have not write fnx that print tree
*/

import java.util.*;

public class Q_4 {
    // create Node
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


    // helper method
    private static String helper(Node root, Map<String, List<Node>> map) {
        // base case
        if (root == null) {
            return "";
        }

        String s = "(" + helper(root.left, map) + root.data + helper(root.right, map) + ")";
        if (!map.containsKey(s)) {
            map.put(s, new ArrayList<>());
        }

        map.get(s).add(root);
        return s;
    }

    public static List<Node> findDuplicateSubtrees(Node root) {
        List<Node> ans = new ArrayList<>();
        Map<String, List<Node>> map = new HashMap<>();
        helper(root, map);

        for (List<Node> group : map.values()) {
            if (group.size() > 1) {
                ans.add(group.get(0));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        /*
            Our tree will be

                        1
                       / \
                      4   3
                     /   / \
                    3   4   3
                       /
                      3

            For the above tree 
                Output :-
                    [4,3]
                    [3]

        */

        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);

        root.left.left = new Node(3);

        root.right.left = new Node(4);
        root.right.left.left =  new Node(3);
        root.right.right = new Node(3);

        List<Node> list = new ArrayList<>();

        list = findDuplicateSubtrees(root);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).data);
        } 
    }
}
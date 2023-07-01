/*
    ? Q.2:- Longest word in Dictionary.
*/

public class Q_2 {
    public static class Node{
        private char data;
        private String word;
        private boolean isEnd;
        private Node[] children;

        public Node(char data){
            this.data = data;
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }

    private static Node root = new Node('/');
    private static String ans = "";

    // insert fnx
    private static  void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node(word.charAt(i));
            }

            curr = curr.children[idx];
        }

        curr.isEnd = true;
        curr.word = word;
    }

    private static  void dfs(Node node){
        if(node == null){
            return;
        }

        if(node.word != null){
            if(node.word.length() > ans.length()){
                ans = node.word;
            }
            else if(node.word.length() == ans.length() && node.word.compareTo(ans) < 0){
                ans = node.word;
            }
        }

        for(Node child : node.children){
            if(child != null && child.word != null){
                dfs(child);
            }
        }
    }


    public static String longestWord(String[] words){
        for(String str : words){
            insert(str);
        }

        Node curr = root;
        dfs(curr);
        return ans;
    }

    public static void main(String[] args) {
        String word[] = {"w" , "wo" , "wor" , "worl" , "world"};
        System.out.println(longestWord(word));
    }
}

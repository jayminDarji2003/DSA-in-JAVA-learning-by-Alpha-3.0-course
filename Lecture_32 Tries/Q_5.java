// Q.5 :- Longest word with all prefixes
/*
    Des:- Find the longest in words such that every prefix of it also in words.    
*/

public class Q_5 {
    // create node
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    // insert fnxl
    public static void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp){
        // base case
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                // backtrack
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }


    public static void main(String[] args) {
        String words[] = {"a", "banana" , "app" , "appl", "ap" , "apply" , "apple"};

        // creating a Trie from words
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}

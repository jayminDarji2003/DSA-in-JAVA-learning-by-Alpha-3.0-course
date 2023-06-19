/*
    * Word Break Problem
*/

public class word_break_problem {
    // Create Trie
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    // declare Root
    public static Node root = new Node();

    // Insert fnx
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

    // Search fnx
    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    // word break fnx
    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;  // base case

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) 
                && wordBreak(key.substring(i)))
            {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String words[] = {"i","like","sam","samsung","mobile","ice"};

        // inserting "word" to the Trie 
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        String key = "ilikesamsung";
        String key2 = "ilikesung";

        System.out.println(wordBreak(key));
        System.out.println(wordBreak(key2));
    }    
}
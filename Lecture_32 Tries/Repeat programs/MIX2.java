/*
    This is a mix JAVA FILE that include all code of Trie learned till now.
*/

public class MIX2 {
    // creating a class
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    //  Declare root here,
    public static Node root = new Node();

    // Create Insert fnx
    public static void insert(String word){  // O(l)
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
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

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };

        // send one by one word to the Insert fnx
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        // perform search fnx
        String key = "there";
        boolean ans = search(key);
        if(ans){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}

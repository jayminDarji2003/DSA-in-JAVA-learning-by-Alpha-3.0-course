/*
    * Create a Trie and Insert and Search in a Trie.
 */

public class create_insert_search {
    //create a Trie
    static class Node{
        Node children[] = new Node[26]; // 26 char store
        boolean eow = false;
        // constructure
        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    // insert in a Trie fnx
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

    // Search in a Trie fnx
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
        String words[] = {"there","the","a","any","thee","their"};

        // inserting words into the Trie.
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("the"));
        System.out.println(search("an"));
    }
}

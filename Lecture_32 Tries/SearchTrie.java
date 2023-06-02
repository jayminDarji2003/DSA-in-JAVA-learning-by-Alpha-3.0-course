/*
    Search in a Trie.
        -> To search a word in a Trie.
*/

public class SearchTrie {
    static class Node{
        Node children[] = new Node[26];
        boolean efw = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    //insert fnx
    public static void insert(String word){
        Node curr = root;

        // add a letter level wise
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a'; // cal index

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.efw = true;
    }


    // Search fnx
    public static boolean search(String word){  // TC O(l)
        Node curr = root;

        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.efw == true;
    }

    public static void main(String[] args) {
        String words[] = {"the" , "a" ,"there" , "their" , "any" , "thee"};
        
        // insert a word
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}

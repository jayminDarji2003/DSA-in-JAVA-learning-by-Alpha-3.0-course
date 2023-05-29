/*
    Insertion in Trie :-
        Adding a one by one into a Trie.
*/

public class Insertion {
    static class Node{
        Node children[] = new Node[26];
        boolean efw = false;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    // insert fnx
    public static void insert(String word){
        Node curr = root;

        // traverse level wise
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a'; // cal index

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.efw = true;
    }

    public static void main(String[] args) {
        String words[] = {"the" , "a" ,"there" , "their" , "any" , "thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
    }
}

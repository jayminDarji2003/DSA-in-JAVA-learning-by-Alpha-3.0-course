/*
    StartWith Prefix Problem :-
        -> Create a function : boolean startWith(String prefix) --> for a Trie.
        -> Return true if there is a previously inserted string word that has the prefix, and false otherwise.

    Approach :
        step1 :- Create a trie for words.
        step2 :- create insert fnx for add words to trie.
        step3 :- create a : startWith fnx

    
    Time Complexity : O(L) --> L (length of prefix)
    Space Complexity : O(n)
*/

public class Q_3 {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert fnx
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

    // startWith fnx
    public static boolean startWith(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }


    public static void main(String[] args) {
        String words[] = {"apple","app","mango","man","woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        // create Trie
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startWith(prefix1));
        System.out.println(startWith(prefix2));
    }
}
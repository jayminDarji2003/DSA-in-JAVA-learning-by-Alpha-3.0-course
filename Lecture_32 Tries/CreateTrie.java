/**
    Creating a Trie
 */
public class CreateTrie {
    static class Node{
        Node[] children = new Node[26]; // 26 size
        boolean endOfWords = false; 

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); 

    public static void main(String[] args) {
        
    }
}
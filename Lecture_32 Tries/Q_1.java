/*
    ? Q_1 :- Word Break Problem.
        --> Given an input string and dictionary of words, find out if the input string can be broken into a space separated sequence of dictionary words.
*/

public class Q_1 {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert fnx
    public static void insert(String word){
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

    // search fnx
    public static boolean search(String key){  //O(L)
        Node curr = root;

        for(int level = 0; level < key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key){
        // base case
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            // subString(beg idx, last idx) --> subString(0,i)
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true; 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[] = {"i" , "like" , "sam" , "samsung" , "mobile", "ice"};
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        String key = "ilikesamsung";
        String key2 = "ilikesamsum";
        System.out.println(wordBreak(key));        
        System.out.println(wordBreak(key2));        
    }
}

/*
    ? Q.1 :- Group anagrams together
    * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
*/
import java.util.*;

class TrieNode{
    List<String> data;
    TrieNode[] children;
    boolean isEnd;

    public TrieNode(){
        data = new ArrayList<>();
        children = new TrieNode[26];
        isEnd = false;
    }
}


public class Q_1 {
    static TrieNode root;
    static List<List<String>> ans;

    static public List<List<String>> groupAnagrams(String[] strs){
        ans = new ArrayList<>();
        root = new TrieNode();

        for(String word: strs){
            build(word);
        }

        dfs(root);

        return ans;
    }

    public static  void build(String s){
        TrieNode temp = root;
        char[] word = s.toCharArray();
        Arrays.sort(word);
        for(char c: word){
            TrieNode child = temp.children[c-'a'];
            if(child == null){
                temp.children[c-'a'] = new TrieNode();
            }
            temp = temp.children[c-'a'];
        }
        temp.isEnd = true;
        temp.data.add(s);
    }

    public static void dfs(TrieNode rt){
        if(rt.isEnd){
            ans.add(rt.data);
        }

        for(int i=0; i<26; i++){
            if(rt.children[i] != null){
                dfs(rt.children[i]);
            }
        }
    }


    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }    
}
/*
    Q.2 :- Valid Anagram.

    -> Given two string S and T return true if T is an anagram of S, and false otherwise.
*/
import java.util.*;

public class Q_2 {
    public static boolean isAnagram(String s , String t){   // O(n)
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        // add S value to Map.
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // condition
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch) - 1);
                }
            }
            else{
                return false;
            }

        }


        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "tulip";
        String t = "lipid";

        System.out.println(isAnagram(s, t));
    }
}

/*
    Q.3 :- Sort by Frequency
*/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Q_3 {
    public static String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() == b.getValue() ? a.getKey() : b.getValue() - a.getValue());


        for(Map.Entry<Character,Integer> e : map.entrySet()){
            pq.add(e);
        }

        StringBuilder res = new StringBuilder();
        while(pq.size() != 0){
            char ch = pq.poll().getKey();
            int val = map.get(ch);
            while(val != 0){
                res.append(ch);
                val--;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Tree";
        System.out.println(frequencySort(s));
    }
}

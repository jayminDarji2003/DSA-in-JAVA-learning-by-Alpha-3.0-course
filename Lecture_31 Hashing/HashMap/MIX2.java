/*
    Implement HashMap:- 
        put()
        get()
        remove()
        containsKey()
        isEmpty()
        keySet()
*/

import java.util.*;

public class MIX2 {
    // main HashMap class
    static class HashMap<K, V> {
        // Node class
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n;
        private int N; // sise of buckets
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // helper fnx to find Bucket Index
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % 4;

        }

        // helper fnx to find Data Index
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        // halper fnx for Rehash our HashMap
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in new bucket
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); i++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        // put fnx
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                // exist and do update
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // containsKey fnx
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) { // valid
                return true;
            } 
            else {
                return false;
            }
        }


        // get fnx
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }

        // remove fnx
        public V remove(K keK){
            int bi = hashFunction(keK);
            int di = searchInLL(keK, bi);
            
            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }


        // keySet fnx
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }

            return keys;
        }


        // isEmpty fnx
        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 6);


        System.out.println(hm.get("India"));
        hm.remove("China");
        System.out.println(hm.get("China"));

        System.out.println(hm.keySet());
    }
}

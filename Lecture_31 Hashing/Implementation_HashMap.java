/*
    Implementation HashMap :-  How HashMap implement internally.
        for all TC = O(1)
            put()
            get()
            containsKey()
            remove()
            keySet()
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation_HashMap {
    static class HashMap<K, V> {
        // here K,V are Generic. K(key) and V(value). Generic means value are not
        // defiend.

        // Node
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n(nodes)
        private int N; // bucket list length
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")

        // constructor
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }


        // put fnx implement

        private int hashFunction(K key){
            int hc = key.hashCode();      
            return Math.abs(hc) % N;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuckt[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>(); 
            }

            // node -> add in new Bucket 
            for(int i=0; i<oldBuckt.length; i++){
                LinkedList<Node> ll = oldBuckt[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key);  // return bucket index
            int di = searchInLL(key,bi);   //  data index return. valid or -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }



        public boolean containsKey(K key){
            int bi = hashFunction(key);  // return bucket index
            int di = searchInLL(key,bi);   //  data index return. valid or -1

            if(di != -1){ // valid value | key exits    
                return true;
            }
            else{
                return false;
            }
        }


        public V get(K key){
            int bi = hashFunction(key);  // return bucket index
            int di = searchInLL(key,bi);   //  data index return. valid or -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }


        public V remove(K key){
            int bi = hashFunction(key);  // return bucket index
            int di = searchInLL(key,bi);   //  data index return. valid or -1

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }


        public ArrayList<K> ketSet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }


        public boolean isEmpty(){
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US",50);

        ArrayList<String> keys = hm.ketSet();

        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("India value = " + hm.get("India"));
        System.out.println("Delete India = " + hm.remove("India"));
        System.out.println("India value = " + hm.get("India"));
    }
}

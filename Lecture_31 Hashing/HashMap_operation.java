/*
    HashMap :-
        There are 4 operation in HashMap
            1. create - O(1)
                -> to create HashMap
                step1: import java.util.HashMap;
                step2:
                    HashMap<KeyType,valueType> hm = new HashMap<>();
                    ex.
                    HashMap<String,Integer> hm = new HashMap<>();
                    
            2. Insert - O(1)
                    put(key,value);
                    ex.
                        hm.put("India",100);

            3. Get - O(1)
                    get(key);
                    ex.
                        hm.get("India"); ---> It returns the value of key.

            4. remove - O(1)
                    remove(key);
                    ex.
                        hm.remove("India");  ---> remove and return value of key.

            5. size print
                    size();
                    ex.
                        hm.size();

            6. is empty --> check hashmap is empty or not
                    isEmpty();
                    ex.
                        hm.isEmpty();
                
            7. clear --> clear hashMap
                    clear();
                    ex.
                        hm.clear();

*/
import java.util.HashMap;

public class HashMap_operation {
    public static void main(String[] args) {
        // CREATE   
        HashMap<String,Integer> hm = new HashMap<>();

        // INSERT
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",88);
        hm.put("Srilanka",40);

        //print HASHMAP
        System.out.println(hm);

        // GET
        int popInd = hm.get("India"); // return value of key
        System.out.println(popInd);  
        System.out.println(hm.get("Indonesia"));  // return null value because key not exits in hashmap


        // REMOVE
        System.out.println(hm.remove("Nepal"));  // remove and return value of key
        System.out.println(hm.remove("Bhutan"));  // key not exits so return null


        // SIZE
        System.out.println("Size of HashMap is " + hm.size());

        // IS EMPTY
        System.out.println("Is empty fnx : " + hm.isEmpty());

        // CLEAR
        hm.clear();
        System.out.println("Size after clear fnx : " + hm.size());

    }
}
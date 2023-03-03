public class RepeatQ12 {

    public static void removeDuplicats(String str, int idx, StringBuilder newStr, boolean map[]){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            // duplicate
            removeDuplicats(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicats(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void removeDup(String str, int idx, StringBuilder newStr, boolean map[]){
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // kaam

        // cal currChar
        char currChar = str.charAt(idx);

        //call and check condition
        if(map[currChar - 'a'] == true){
            // duplicate
            removeDup(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDup(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        // String str = "jaaymiin";
        // removeDuplicats(str, 0, new StringBuilder(""), new boolean[26]);

        String str = "jaaydeep";
        removeDup(str,0, new StringBuilder() , new boolean[26]);

    }
}

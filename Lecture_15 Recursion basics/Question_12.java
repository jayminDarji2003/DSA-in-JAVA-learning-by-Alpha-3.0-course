/*  google and microsoft asked this question
    Q.Remove duplicats in a string

    "appnnacollege"
 */

// public class Question_12 {
//     public static void removeDup(String str,int idx, StringBuilder newStr , boolean map[]){
//         // base case
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         // kaam
//         char currChar = str.charAt(idx);
//         if(map[currChar - 'a'] == true){
//             // duplicate
//             removeDup(str, idx+1, newStr, map);
//         }else{
//             map[currChar - 'a'] = true;
//             removeDup(str, idx+1, newStr.append(currChar), map);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         removeDup(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }



public class Question_12 {

    // function to remove deplicats
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


    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicats(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
/*
    Q.2 :- 1verse a string using Stack
 */

import java.util.*;

public class Question_2 {

    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder("");

        while(! s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseStr(str);
        System.out.println(result);
    }
}

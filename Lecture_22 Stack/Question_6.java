/*
    Q.6 :- Valid Parentheses

    ex. ({[]}) --> valid
    ex. ([]})  --> not valid

 */

import java.util.*;

public class Question_6 {
    public static boolean isValid(String str) {  // O(n)
        Stack<Character> s = new Stack<>(); // store opening brackets

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) { // when stack empty
                    return false;
                }

                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({})[]"; // output true
        String str2 = "(({})[]"; // output false

        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}

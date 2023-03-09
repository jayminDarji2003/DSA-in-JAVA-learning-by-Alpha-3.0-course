/*
    Q.2 :- Simplify path

    Time Complexity = O(n)
    Space Complexity = O(1)
 */

import java.util.*;
import java.io.*;

public class Q_2 {

    static String simplify(String A) {
        Stack<String> s = new Stack<String>();
        String res = "";
        res += "/";
        int len_A = A.length();

        for (int i = 0; i < len_A; i++) {
            String dir = "";
            while (i < len_A && A.charAt(i) == '/') {
                i++;
            }
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }

            if (dir.equals("..") == true) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (dir.equals(".") == true) {
                continue;
            } else if (dir.length() != 0) {
                s.push(dir);
            }

            Stack<String> s2 = new Stack<String>();
            while (!s.empty()) {
                s2.push(s.pop());
            }

            while (!s2.empty()) {
                if (s2.size() != 1) {
                    res += (s2.pop() + "/");
                } else {
                    res += s2.pop();
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        String res = simplify(str);
        System.out.println(res);
    }
}

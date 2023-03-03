/*
    Q. Print Nth fibonacci number.
 */

public class Question_5 {
    public static int fib(int n) {
        // base cases
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fib = fnm1 + fnm2;
        return fib;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}

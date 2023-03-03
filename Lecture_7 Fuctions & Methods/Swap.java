public class Swap {
        // for pro:2
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

        // pro:1

        // // simple code of swap
        // int a = 10;
        // int b = 20;

        // // swap
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a);
        // System.out.println(b);

        // Pro:2

        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);

    }
}

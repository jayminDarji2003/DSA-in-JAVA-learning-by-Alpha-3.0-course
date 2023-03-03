import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            int     --> nextInt()
            float   --> nextFloat() 
            double  --> nextDouble()
            String  --> next()   --> only one word
            String  --> nextLine()   --> for whole sentence
            byte    -->nextByte()
            boolean -->nextBoolean()
            short   -->nextShort()
            long    -->nextLong()
        */


        // int 
        // int n = sc.nextInt();
        // System.out.println(n);

        // short
        // short s = sc.nextShort();
        // System.out.println(s);

        //byte
        // byte  b = sc.nextByte();
        // System.out.println(b);

        // long
        // long l = sc.nextLong();
        // System.out.println(l);

        //float
        // float f = sc.nextFloat();
        // System.out.println(f);

        // double
        // double d = sc.nextDouble();
        // System.out.println(d);

        // String --> only take one word
        // String str = sc.next();
        // System.out.println(str);

        // String --> taking whole string(sentence)
        // String fullName = sc.nextLine();
        // System.out.println(fullName);

        // boolean --> take only true of false
        boolean b = sc.nextBoolean();
        System.out.println(b);

        sc.close();
    }
}

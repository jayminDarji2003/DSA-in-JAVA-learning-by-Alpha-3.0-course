public class typeCasting {
    public static void main(String[] args) {
        /* 
            Type casting:-
                When we want to convert --> Biger unit in Smaller unit value then the type casting used.
                    ex:-
                        suppose we have,
                        float a = 12.12;
                        int b = (int) a; 

        */

            // converting float value in int value
        float a = 12.12F;
        int b = (int) a;

        System.out.println(b);

            // converting chat value to int value
        char ch = 'a';
        int num1 = ch;
        System.out.println(num1);
            
    }
}

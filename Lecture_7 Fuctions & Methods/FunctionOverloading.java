public class FunctionOverloading {
        // pro:1
    // public static int sum(int a, int b){
    //     return (a + b);
    // }
    // public static int sum(int a, int b, int c){
    //     return (a + b + c);
    // }


        // pro:2
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a + b;
    }


    public static void main(String[] args) {
        /*
            function overloading :- Function overloading means multiple function with same name but different arguments 
         */

            // Pro:1
        //  System.out.println(sum(10,20));
        //  System.out.println(sum(10,20,30));


            // Pro:2
         System.out.println(sum(10,20));
         System.out.println(sum(10.10F,20.80F));



    }
}

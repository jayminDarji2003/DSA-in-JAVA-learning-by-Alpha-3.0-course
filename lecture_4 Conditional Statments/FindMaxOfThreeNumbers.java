public class FindMaxOfThreeNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        // find max of 3 numbers
        // first approach

        // if(a >= b){
        // if(a >= c){
        // System.out.println("a is max");
        // }
        // else{
        // System.out.println("c is max");
        // }
        // }
        // else{
        // if(b >= c){
        // System.out.println("b is max");
        // }
        // else{
        // System.out.println("c is max");
        // }
        // }


        // second approach
        if(a>b && a>c){
            System.out.println("a is max ");
        }
        else if(b>a && b>c){
            System.out.println("b is max");
        }else{
            System.out.println("c is max");
        }

    }
}

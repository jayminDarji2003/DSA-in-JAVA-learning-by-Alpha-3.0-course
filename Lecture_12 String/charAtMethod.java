public class charAtMethod {

    public static void printString(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
         System.out.println();
    }   

    public static void main(String[] args) {
        // charAt() --> this method is used to print character at perticular position using of index.

        String name = "jaymin";
        //System.out.println(name.charAt(0)); // print which character is index -> 0


        //calling printString method
        printString(name);
    }
}

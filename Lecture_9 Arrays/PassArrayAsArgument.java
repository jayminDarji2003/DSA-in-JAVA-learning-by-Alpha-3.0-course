    // Passing array as a argument
public class PassArrayAsArgument {
    public static void main(String[] args) {
        int marks[] = {97,96,95};
        update(marks);  // array will be pass as a reference

        // print
        for(int i=0; i<marks.length; i++){
            System.out.println("The marks is : " + marks[i]);
        }
    }

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
}

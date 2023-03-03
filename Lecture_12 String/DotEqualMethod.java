public class DotEqualMethod {
    public static void main(String[] args) {
        // ".equal" -> method is used to compare two string

        String s1 = "Tony";
        // String s2 = "Tony";
        String s3 = new String("Tony");
 
        if(s1.equals(s3)){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }

    }
}

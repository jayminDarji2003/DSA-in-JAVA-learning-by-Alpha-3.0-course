public class SubString {
    // calculate substring 
    public static String getSubString(String str,int si,int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        // System.out.println(getSubString(str, 0, 5));

        // substring is an in-built function in java so we no need to make substring function.
        System.out.println(str.substring(0,5));
    }
}

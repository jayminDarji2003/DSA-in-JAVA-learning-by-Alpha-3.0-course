// convert first char to uppercase for all word.
// if we have --> hi, i am jaymin
                // then
            //-->Hi, I Am Jaymin  

public class Question_4 {

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));   // append ' ' to the sb
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am jaymin";
        System.out.println(toUpperCase(str));
    }
}


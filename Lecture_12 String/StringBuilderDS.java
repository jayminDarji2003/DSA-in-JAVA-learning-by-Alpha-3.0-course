public class StringBuilderDS {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='A'; ch<='Z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}

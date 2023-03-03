public class ReverseGivenNumber {
    public static void main(String[] args) {
        // REVERSE GIVEN NUMBERS

        int number = 10899;
        int rev = 0;

        while(number > 0){
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number = number / 10;
        }

        System.out.println(rev);

    }
}

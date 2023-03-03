public class BinaryToDecimal {

    public static void binToDec(int BinNum){

        int myNum = BinNum;

        int pow=0;
        int decNum = 0;
        
        while(BinNum > 0){
            int lastDigit = BinNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            BinNum  = BinNum / 10;
        }

        System.out.println("Decimal of " + myNum + " is = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}

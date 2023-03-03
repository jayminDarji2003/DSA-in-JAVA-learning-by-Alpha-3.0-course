//count set bit in a number
// means how many times 1 comes in a number

public class Question_3 {
    public static int countSetBit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }  
    
    public static void main(String[] args) {
        System.out.println(countSetBit(190));
    }
}

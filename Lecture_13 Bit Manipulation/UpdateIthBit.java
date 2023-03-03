public class UpdateIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        //first approach
        // if(newBit == 0){
        //     return clearIthBit(n,i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // second approach
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;

    }

    public static void main(String[] args) {
        int newVal = updateIthBit(10, 2, 1);
        System.out.println(newVal);
    }
}

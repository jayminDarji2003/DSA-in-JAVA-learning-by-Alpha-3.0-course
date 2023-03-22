/*
    Q.2 :- Kth largest odd number in a given range
*/

package Assignment;
public class Q_2 {
    static int KthOdd(int range[], int K){
        if(K <= 0){
            return 0;
        }

        int L = range[0];
        int R = range[1];

        if((R & 1) > 0){
            int count = (int) Math.ceil(R - L +1) / 2;
            if(K > count){
                return 0;
            }else{
                return (R - 2 * K + 2);
            }
        }else{
            int count = (R - L + 1) / 2;
            if(k > count){
                return 
            }
        }
    }
        
    
    public static void main(String[] args) {
        
    }
}

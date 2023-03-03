import java.util.concurrent.Flow.Publisher;

public class PalindromicPattern {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //space
            for(int sp=1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            //num part-1
            for(int num=i; num>=1; num--){
                System.out.print(num);
            }
            //num part-2
            for(int num=2; num<=i; num++){
                System.out.print(num);
            }

            System.out.println();
        }
    }

}

public class Question_3 {
    public static void main(String[] args) {
        int x , y , z;
        x = y = z = 2;

        x += y;     // x = x + y;
        y -= z;     // y = y - z;
        z /= (x + y);   // z = z / (x+y);

        System.out.println("The value of x is : " +  x);
        System.out.println("The value of y is : " +  y);
        System.out.println("The value of z is : " +  z);
    }
}   

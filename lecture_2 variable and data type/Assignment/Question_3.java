import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of Pencil : ");
        float pencilCost = sc.nextFloat();

        System.out.print("Enter cost of Pen : ");
        float penCost = sc.nextFloat();

        System.out.print("Enter cost of Eraser : ");
        float eraserCost = sc.nextFloat();

        float totalCost = pencilCost + penCost + eraserCost;
        float totalCostWithGst = totalCost +  (totalCost * 18) / 100;
        System.out.println("The total cost of items (Without GST 18%) is : " + totalCost);
        System.out.println("The total cost of items (With GST 18%) is : " + totalCostWithGst);


        sc.close();
    }
}

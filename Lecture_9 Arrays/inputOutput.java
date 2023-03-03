import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        int marks[] = new int[4];
        Scanner sc = new Scanner(System.in);

        // To add static values
        /* marks[0] = 99; // phy
        marks[1] = 98; //chem
        marks[2] = 97; //math */

        // take from user
        marks[0] = sc.nextInt();    //phy
        marks[1] = sc.nextInt();    //chem
        marks[2] = sc.nextInt();    //math

        //Output of array

        System.out.println("Phy marks is : " + marks[0]);
        System.out.println("Chem marks is : " + marks[1]);
        System.out.println("Math marks is : " + marks[2]);


        //update
        marks[2] = 100;
        System.out.println("Chem marks is : " + marks[2]);

        // also method -->we know just add 1 then
        marks[1] = marks[1] + 1;
        marks[2] +=1;
        System.out.println("Chem marks is : " + marks[1]);
        System.out.println("Math marks is : " + marks[2]);


        // to calculate length of an array  --> use length property
        System.out.println(marks.length);

        sc.close();
    }
}

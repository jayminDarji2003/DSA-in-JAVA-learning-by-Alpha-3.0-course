public class _2_TypeOfConstructor {
    public static void main(String[] args) {
        // There are three types of constructor

        //1.non-parameterized
        //2.parameterized
        //3.copy constructor

        //1.non-parameterized
        // Students s1 = new Students();

        //2.parameterized
        // Students s2 = new Students("Jaymin" , 19);
        // s2.getDetails();

        //3.copy consructor
        Students s3 = new Students();
        s3.name = "jeel";
        s3.age = 55;
        s3.marks[0] = 100;
        s3.marks[1] = 90;
        s3.marks[02] = 80;
        s3.password = "abcde";  // if we forgot password then copy these objects details to another object

        Students s4 = new Students(s3);
        s4.password = "jdjdjd"; //we made a new password

        s3.marks[02] = 100;

        for(int i=0; i<s4.marks.length; i++){
            System.out.println(s4.marks[i]);
        }
    }
}


class Students{
    String name;
    int age;
    String password;
    int marks[];

    // Non-parameterized constructor
    Students(){
        marks = new int[3];
        System.out.println("Non-parameterized constructor called..");
    }
    
    //parameterized constructor
    // Students(String name,int age){
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("parameterized constructor called..");
    // }

    // to print details
    // void getDetails(){
    //     System.out.println("Name of the student is : " + name);
    //     System.out.println("Age of the student is : " + age);
    // }


    // // shallow copy consructor
    // Students(Students s3){
    //     marks = new int[3];
    //     this.name = s3.name;
    //     this.age = s3.age;
    //     this.marks =s3.marks;
    // }



    // deep copy consructor
    Students(Students s3){
        marks = new int[3];
        this.name = s3.name;
        this.age = s3.age;
        for(int i=0;i<marks.length; i++){
            this.marks[i] = s3.marks[i];
        }
    }
}

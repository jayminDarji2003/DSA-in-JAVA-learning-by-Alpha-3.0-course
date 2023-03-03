public class static2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "kirc";
        System.out.println(s1.schoolName);
        
        Student s2 = new Student();
        s2.schoolName = "Gujarat Univercity";
        System.out.println(s2.schoolName);
        
        System.out.println(s1.schoolName);
    }
}

class Student{
    String name;
    int rollNO;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

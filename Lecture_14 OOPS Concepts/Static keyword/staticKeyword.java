class staticKeyword{
    public static void main(String[] args) {
        //Student s1 = new Student();
        //s1.shoolName = "KIRC";
        
        //Student s2 = new Student();
        //System.out.println(s2.shoolName);
        
        //Student s3 = new Student();
        //s1.shoolName = "KIRC college";

        //Student s4 = new Student();
        //System.out.println(s4.shoolName);
    }
}

class Student{
    String name;
    int roll;

    static String shoolName;

    void setName(String name){
        this.name = name;
    }
    void setRoll(int roll){
        this.roll = roll;
    }

    String getName(){
        return this.name;
    }
}
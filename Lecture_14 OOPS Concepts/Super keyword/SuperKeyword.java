/*
    Super keyword :- In simple words when we want to access parent class property,function,constuctor then this is used.
 */

class SuperKeyword{
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.age);
    }
}

class Animal{
    int age;
    Animal(){
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }
    void color(){
        System.out.println("Animal color is brown");
    }
    int age(){
        return this.age;
    }
}

class Horse extends Animal{
    Horse(){
        super.eat();
        super.color();
        super.age = 10;
        System.out.println("Horse constructor called");
    }
}
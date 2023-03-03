package Inheritance;
public class HierarchicalInhe {
    public static void main(String[] args) {
        Mammal m = new Mammal();
            // base class properties
        m.color="black";
        m.breath();
        m.eat();
            //derived class properties
        m.walk();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");

    }

    void breath() {
        System.out.println("Breaths");
    }
}

//Derived class
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

//Derived class
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

//Bird class
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}
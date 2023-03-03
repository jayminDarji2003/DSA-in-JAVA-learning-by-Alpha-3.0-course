package Inheritance;

public class MultiLevelInhe {
    public static void main(String[] args) {
        Dog tom = new Dog();
        tom.color = "White";
        tom.eat();
        tom.legs = 4;
        System.out.println(tom.legs);
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
    int legs;
}

//Derived class
class Dog extends Mammal{
    String breed;
}
package Inheritance;

public class singleInheritance{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();
    }
}


    //Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");

    }

    void breath(){
        System.out.println("Breaths");
    }
}


    //Derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in water");
    }
}

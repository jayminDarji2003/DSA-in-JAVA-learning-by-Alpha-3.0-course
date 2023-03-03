package Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}


//base class
class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}


// derived class
class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}

package Inheritance;

// This program is just for knowledg don't consider it's too long so this will be very hard.
    
    //Hybrid inheritance :- collection of inheritance

public class HybridInhe {
    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        p1.color = "blue";
        p1.breath();
        p1.eat();
        p1.fly();
        p1.sing();
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
class Dog extends Mammal{
    String dogName;

    void DogName(){
        System.out.println("Dog name is tommy");
    }
}
class Cat extends Mammal{
    String cuttie;

    void cutties(){
        System.out.println("My cat is very cute");
    }
}
class Human extends Mammal{
    int knowledge;

    void knowledg(){
        System.out.println("Hunam has very powerful");
    }
}




//Derived class
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Tume extends Fish{
    void tumeName(){
        System.out.println("Tume name is tonny");
    }
}
class Shark extends Fish{
    void sharkName(){
        System.out.println("Shark name is Danger");
    }
}

//Bird class
class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}
class Peacock extends Bird{
    void sing(){
        System.out.println("Peacock can sing");
    }
}

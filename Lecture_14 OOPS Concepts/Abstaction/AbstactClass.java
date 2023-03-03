package Abstaction;

public class AbstactClass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.chanegColor();    // change color 
        System.out.println(h.color);   
        
        System.out.println();

        Chicken c = new Chicken();
        c.eat();
        c.walk();


        // Animal a = new Animal();  // if want to create object of Absract class the throw error
    }
}


abstract class Animal{
    String color;

    Animal(){   // This consructor give default value to --> color
        color = "Brown";
        System.out.println("Consructor of Animal");
    }

    void eat(){ 
        System.out.println("Animal eats");
    }

    abstract void walk();   // give idea 
}

class Horse extends Animal{
    Horse(){
        System.out.println("Consructor of horse");
    }
    void chanegColor(){
        color= "Dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    void chanegColor(){
        color= "Yellow";
    }
    void walk(){
        System.out.println("Walks on 3 legs");
    }
}


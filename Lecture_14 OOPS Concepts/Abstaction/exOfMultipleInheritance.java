package Abstaction;

public class exOfMultipleInheritance {
    public static void main(String[] args) {
        Line L = new Line();
        L.eatType();
        L.eatTypes();
    }   
}

interface Herbivore{
    void eatTypes();
}

interface Carnivore{
    void eatType();
}

class Line implements Herbivore,Carnivore{
    public void eatType(){
        System.out.println("Eats meat");
    }
    public void eatTypes(){
        System.out.println("Eats MEAT");
    }
}

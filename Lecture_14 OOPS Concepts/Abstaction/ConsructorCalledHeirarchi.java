package Abstaction;

public class ConsructorCalledHeirarchi {
    public static void main(String[] args) {
        C c = new C();
    }
}

abstract class A {
    A() {
        System.out.println("A consructor called");
    }
}

class B extends A {
    B() {
        System.out.println("B consructor called");
    }
}

class C extends B {
    C() {
        System.out.println("C consructor called");
    }
}

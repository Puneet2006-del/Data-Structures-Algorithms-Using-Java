// Abstract Classes
abstract class Janwar{
    abstract void sound(); // no body
    void sleep(){
        System.out.println("Janwar so raha hai");
    }
}

class Dog extends Janwar{
    void sound(){
        System.out.println("Kutta is Barking");
    }
}

interface  Vehicle{
    void start(); // abstract by default
}

class Car2 implements Vehicle{
    public void start(){
        System.out.println("Starts");
    }
}

public class AbstractAndInterfaces {
    public static void main(String[] args) {
//        Janwar j1 = new Dog();
//        j1.sleep();
//        j1.sound();

        // Interface
        Vehicle v1 = new Car2();
        v1.start();
    }
}

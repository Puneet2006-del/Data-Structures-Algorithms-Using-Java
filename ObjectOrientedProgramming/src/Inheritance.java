public class Inheritance {
    public static void main(String[] args){
//        Person p1 = new Person(21 , "Puneet");

        Developer d1 = new Developer(25, "Puneet");
        d1.walk();

//       Encapsulation obj = new Encapsulation();
//       obj.dowork();

    }
}


class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
    }

    @Override
    void walk() { // RunTime Polymorphism
        System.out.println("Developer " + name + " is walking");
    }
}

class Person{
    int age;
    String name;

    static int count;

    public Person(){
        count++;
        System.out.println("Creating an object");
    }

    public Person(int age, String name){
//        this(); // Calling Person inside different constructor.
        this.name = name;
        this.age = age;
//        System.out.println(name + " " + age);
    }

    void eat(){
        System.out.println(name + " is eating");
    }
    void walk(){
        System.out.println(name + " is walking");
    }
    void walk(int steps){ // CompileTime Polymorphism, walk is taking different forms.
        System.out.println(name + " walked " + steps + " steps");
    }
    void doWork(){
        System.out.println("Person is working");
    }

}

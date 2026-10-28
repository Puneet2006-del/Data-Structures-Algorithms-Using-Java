public class Constructors {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Puneet", 21);
    }
}
class Student2{
    String name;
    int age;

    // IIB = It will run instantly ever before the constructor.
    {
        System.out.println("It is IIB (Instance Initialized Block)");
    }
    // Creating a constructor.
    // It does not have any return type, not even void.

    Student2(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Student name is " + name + " and he is " + age + " years old.");
    }
}
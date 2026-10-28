public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Puneet");
        Student s2 = new Student("Rahul");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(Student.college);
        Student.collegeName();
    }
}

class Student{
    static String college = "Amity University"; // The static keyword means the member belongs to the class, not to objects.
    String name;

    Student(String n){ // A constructor is a special method used to initialize objects.
        name = n;
    }

    static void collegeName(){
        System.out.println("College: " + college);
    }
}

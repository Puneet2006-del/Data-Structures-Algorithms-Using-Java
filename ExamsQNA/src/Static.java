class Students{
    static String school = "SD Public School"; // It is a static variable it a now constant.
    String name; // Non-Static

    static void showSchoolName(){ // Static Method not Overridable. And don't need any object
        System.out.println(school);
    }

    // Constructor
    Students(String name){
        this.name = name;
        System.out.println(name);
    }
}

public class Static {
    public static void main(String[] args) {
        Students.showSchoolName(); // Calling static method.
        Students s1 = new Students("Speed");
        Students s2 = new Students("Jack");
    }
}

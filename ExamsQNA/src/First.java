public class First {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Atul";
        s1.age = 21;
        s1.Study();
    }
}


class Student{
    String name;
    int age;

    void Study(){
        System.out.println(name + " is Studying");
        System.out.println(name + " is " + age + " years old");
    }
}
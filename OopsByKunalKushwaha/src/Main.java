public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(5,"Puneet", 95.2f);
//        s1.marks = 95.0f;
//        s1.name = "Puneet";
//        s1.rollNo = 1;
        Student s2 = new Student(2,"Rahul",76f);
        Student s3 = new Student(1,"Fardeen", 87.6f);
    }
}

class Student{
    int rollNo;
    String name;
    float marks;

    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}



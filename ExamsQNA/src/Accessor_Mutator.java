class St{
    private int marks;

    // Mutator
    public void setMarks(int marks){
        this.marks = marks;
    }

    // Accessor
    public int getMarks(){
        return marks;
    }
}

class X {
    void show() {
        System.out.println("A's show");
    }
}

class Y extends X{
    void show() {
        System.out.println("B's show");
    }
}


public class Accessor_Mutator {
    public static void main(String[] args) {
        St s1 = new St();
        s1.setMarks(45);
        System.out.println(s1.getMarks());
        X obj = new Y();
        obj.show();

    }
}





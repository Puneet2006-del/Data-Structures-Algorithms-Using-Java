interface A{
     abstract void show();
}

interface B{
    abstract void display();
}

class C implements A, B{
    @Override
    public void show() {
        System.out.println("Show From Interface A");
    }

    @Override
    public void display() {
        System.out.println("Display From Interface B");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.show();
    }
}

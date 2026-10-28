class Main {
    public void finalize(){
        System.out.println("Object is destroyed");
    }
}

public class Test{
    public static void main(String[] args) {
        Main m1 = new Main();
        m1 = null;
        System.gc();
    }
}


public class Modifiers {
    // static doesn't need any object to access it.
    public static void main(String[] args) {
        System.out.println(Test3.count);
    }
}

class Test3{
    static int count = 0;
    Test3(){
        count++;
    }
}

public class Test2{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.show();
        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(d1.c);
//        System.out.println(d1.d);
    }
}

class Demo{
    public int a = 10;
    protected  int b = 5;
    int c = 12; // Default Access Modifier.
//    private int d = 16;

    void show(){
//        System.out.println(a + " " + b +  " " +  c + " " + d);
    }
}



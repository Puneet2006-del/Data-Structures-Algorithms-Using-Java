// Static-Nested classes
class Outer{
    static class Inner{
        void show(){
            System.out.println("I am inside an inner class");
        }
    }
}

// Inner Classes without static.

class Outer2{
    class Inner2{
        void show(){
            System.out.println("It is an Inner class without static keyword");
        }
    }
}

// Anonymous Inner Class

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}


public class NestedClasses {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
        Outer2 outer = new Outer2();
        Outer2.Inner2 inner = outer.new Inner2();
        inner.show();

        // Overriding Animal class.

        Animal a = new Animal(){
            void sound(){
                System.out.println("Anonymous class sound");// Used to create instantly override the method.
            }
        };
        a.sound();
    }
}


import com.sun.tools.attach.VirtualMachineDescriptor;

class Parent{
    Parent(String name){
        System.out.println("Inside Parent Class " + name);
    }
}

class Child extends Parent{
    Child(){
        super("Puneet");
        System.out.println("Inside Child Class");
    }
}


public class Constructor_Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
    }

}

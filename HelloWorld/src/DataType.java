import java.awt.*;

public class DataType {
    public static void main(String[] args){
        // Primitive types
        byte x = 5;
        byte y = x; //Primitive data types are passed by value, so the original variable remains unchanged — any operation returns a new value.
        x = 10;
        System.out.println(y);

        // Reference Types

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2; // Reference types are copied by references.
        System.out.println(point2);
    }
}

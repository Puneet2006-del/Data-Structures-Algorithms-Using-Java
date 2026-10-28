import java.util.Date;

public class Main{
    public static void main(String[]args){
        // Primitive Data Types
        int myAge = 21; // Camelcase notation for declaring the name of the variable
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        printDate();
    }

    public static void printDate(){ // In Java inside a class it's not a function is called method.
        // Reference Data Types
        Date now = new Date();
        System.out.println(now);
    }
}
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // How to take input from the user in Java.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Your Age: "); // println adds new line
//        byte age = scanner.nextByte();
//        System.out.println("Your age is " + age);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name: ");
//        String name = scanner.next(); // next() method return's only first line
        String name = scanner.nextLine(); // with this method we get the turn line that the user enters no matter
        System.out.println("You are " +  name); // how many spaces and tabs are there.

    }
}

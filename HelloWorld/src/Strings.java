import java.awt.*;

public class Strings {

    public static void main(String[] args){
        // Strings
//        String message = new String("Hello World"); // It is a correct way, we often use Strings
        String message = "  Hello World" + "  !!"; // We can write it like this.
        System.out.println(message.length());
        System.out.println(message.endsWith("!!"));
        System.out.println(message.indexOf("W"));
        System.out.println(message.replace("!!", "##"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim()); // Remove unnecessary spaces
        System.out.println(message); // In Java Strings are immutable we cannot change them.
        // so the modified strings always returns new string.
        // Parameters = Parameters are the holes that we define in our methods.
        // Arguments = Arguments are the actual values that we pass to these methods.

        // Escape Sequences
        System.out.println("Hello \"Puneet\"");
        // C:\Users\Windows...
        System.out.println("C:\\Users\\Windows...");
        System.out.println("C:\nUsers\tWindows...");
    }
}

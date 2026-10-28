import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        int temp = scanner.nextInt();
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink Plenty Of Water"); //{} Braces are only required if we have multiple statements.
        }
        else if (temp>=20 && temp<=30)
            System.out.println("Beautiful Day"); // Doesn't need braces here.
        else
            System.out.println("Cold day");
    }
}

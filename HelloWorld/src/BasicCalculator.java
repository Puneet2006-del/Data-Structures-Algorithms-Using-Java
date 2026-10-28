import java.util.Scanner;

public class BasicCalculator {

    // Build a basic calculator that can perform operations like addition, subtraction, multiplication, and division.
    // Your calculator should take input from the user and display the result of the operation.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose the operation you want (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.println("You chose: " + operator);

        System.out.print("Enter Number 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Number 2: ");
        double num2 = sc.nextDouble();

        switch (operator){
            case '+':
                System.out.println("The sum is: " + (num1 + num2));
                break;

            case '-':
                System.out.println("The difference is: " + (num1 - num2));
                break;

            case '*':
                System.out.println("The product is: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("The quotient is: " + (num1 / num2));
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        sc.close();
    }
}

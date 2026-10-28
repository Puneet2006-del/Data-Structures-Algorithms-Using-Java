package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

// inputmissmatch
// illegal arguments.
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
       try{
           Scanner sc = new Scanner(System.in);
           int ans = sc.nextInt();
           System.out.println("The factorial of number " + ans + " is " + factorial(ans));
       }
       catch (InputMismatchException e){
           System.out.println("Enter a valid input (Integer)");
       }
       catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
    }

    static int factorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("The number should be greater than zero");
        } else if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

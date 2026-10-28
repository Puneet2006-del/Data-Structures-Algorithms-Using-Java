import java.lang.Math;
import java.util.Scanner;

public class CheckPrimeNum {
    // Write a Java program that take the input from the user and check it whether it is prime number or not.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num <= 1){
            isPrime = false;
        }else{
            for (int i = 2; i < Math.sqrt(num); i++){
                if (num % i == 0)
                    isPrime = false;
            }
        }
        if (isPrime){
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}

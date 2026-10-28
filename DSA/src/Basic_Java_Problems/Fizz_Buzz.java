package Basic_Java_Problems;

import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
        // Write a program that takes input from the user and ask for a number
        // if that number divisible by 5 it should return fizz if the number
        // divisible by 3 it should return buzz and the number divisible by both
        // 3 and 5 it should return FizzBuzz and if the number wasn't divisible by both 3 and 5
        // simply return that number.

        FizzAndBuzzProgram();

    }

    static void FizzAndBuzzProgram(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0){
            System.out.println("Fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
    }
}

import java.util.Scanner;
// Divisible by 5 = fizz, 3 =  buzz, both 5 and 3 fizzbuzz and else print the number.
public class Problem_Two {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if(number % 5 == 0){
            System.out.println("Fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(number);
    }
}




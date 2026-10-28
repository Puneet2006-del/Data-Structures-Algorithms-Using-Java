import com.sun.security.jgss.GSSUtil;

import java.lang.Math;
import java.util.Scanner;

public class NumGuessGame {
    // Develop a game where the program randomly selects a number, and the user has to guess it.
    // Provide feedback if the guess is too high or too low, and keep track of the number of attempts the user makes.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100);
        int attempts = 0;
        System.out.print("Enter the attempts you want: ");
        int maxAttempts =  sc.nextInt();
        boolean won = false;
        while(attempts < maxAttempts){
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;
            if (guess == randomNum) {
                System.out.println("You won in " + attempts + " attempts" );
                won = true;
                break;
            } else if (guess > randomNum) {
                System.out.println("Too High!");
                System.out.println("Remaining Attempts: " + (maxAttempts - attempts));
            } else {
                System.out.println("Too Low!");
                System.out.println("Remaining Attempts: " + (maxAttempts - attempts));
            }
        }
        if(!won){
            System.out.println("You Lose Correct Number was " + randomNum + " try again later!");
        }
    }
}

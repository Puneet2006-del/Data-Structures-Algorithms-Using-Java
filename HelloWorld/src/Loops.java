import java.util.Scanner;

public class Loops {
    public static void main(String[]args) {
//        // For Loop
//        for (int i = 0; i < 6; i++){
//            System.out.println(i);
//        }

        // While Loop
       Scanner sc = new Scanner(System.in);
       String input = "";
       while(!input.equals("quit")){
           System.out.print("Input: ");
           input = sc.nextLine().toLowerCase();
           if (input.equals("quit"))
               break;
           System.out.println(input);
       }
    }
}

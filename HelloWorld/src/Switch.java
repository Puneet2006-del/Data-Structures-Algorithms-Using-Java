import java.util.Scanner;

public class Switch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Role:");
        String role = sc.nextLine();
        switch(role){
            case "Admin":
                System.out.println("You are an Admin");
                break;
            case "Moderator":
                System.out.println("You are a Moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
    }
}

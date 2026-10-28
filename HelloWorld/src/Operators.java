//import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Temp: ");
//        int temperature = scanner.nextInt();
//        boolean isWarm = temperature>20 && temperature<30;
//        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);

    }
}

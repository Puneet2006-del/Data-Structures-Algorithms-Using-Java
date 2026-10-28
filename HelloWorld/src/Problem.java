import java.lang.Math;
import java.text.NumberFormat;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        // Mortgage Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount:");
        int principal = scanner.nextInt();

        System.out.print("Enter Annual Interest Rate:");
        float annual_Interest = scanner.nextFloat();
        float monthly_Interest = annual_Interest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years):");
        byte year = scanner.nextByte();
        int no_Of_Payments = MONTHS_IN_YEAR * year;

        double mortgage = principal * (monthly_Interest * Math.pow(1 + monthly_Interest, no_Of_Payments)) /
                (Math.pow(1 + monthly_Interest, no_Of_Payments) - 1);
        String mortgageFormatted  = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

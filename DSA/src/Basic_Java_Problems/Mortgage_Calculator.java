package Basic_Java_Problems;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        mortage_Calculation();
    }

    static void mortage_Calculation(){
        Scanner sc = new Scanner(System.in);
        final int PERCENTAGE = 100;
        final int MONTHS_IN_YEAR = 12;
        System.out.print("Principal: ");
        int principal_amount = sc.nextInt();

        System.out.print("Annual Interest: ");
        float annual_interest = sc.nextFloat();
        float monthly_interest = annual_interest / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int period = sc.nextInt();
        int monthly_period = period * MONTHS_IN_YEAR;

        double mortgage = principal_amount * (monthly_interest * Math.pow(1 + monthly_interest, monthly_period)) /
                (Math.pow(1 + monthly_interest, monthly_period) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

}

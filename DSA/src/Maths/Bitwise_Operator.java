package Maths;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] args) {
        // Odd and Even Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
}

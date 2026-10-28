package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        // Taking input from an array using for loop.
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        // For non-primitive data types like strings:
        String[] names = new String[5];
        for(int i = 0; i < names.length; i++){
            names[i] = sc.next();
        }
        names[1] = "Puneet"; // Fixed (1st index value will be as "Puneet" not changeable)
        System.out.println(Arrays.toString(names));
    }
}

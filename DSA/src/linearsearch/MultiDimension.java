package linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int[][] arr = new int[3][3];
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // Taking Input From 2d Arrays.
        for (int rows = 0; rows<arr.length; rows++ ){
            for (int col = 0; col<arr[rows].length; col++){
                arr[rows][col] = sc.nextInt();
            }
        }
        for (int rows = 0; rows<arr.length; rows++){
            System.out.println(Arrays.toString(arr[rows]));
        }

        ArrayList<Integer> al = new ArrayList<>(5);
        al.add(5);
        al.add(2);
        al.add(7);
        al.add(8);
        al.add(5);
        al.add(2);
        al.add(7);
        al.add(8);
        System.out.println(al);
    }
}

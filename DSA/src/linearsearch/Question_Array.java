package linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class Question_Array {
    public static void main(String[] args) {
        System.out.print("Enter your Arrays: ");
        Scanner sc = new Scanner(System.in);
        // Find the maximum number in this linearsearch.Array.
        int[] arr = new int[10];
//        int[] arr = {1, 45, 23, 85, 96, 21, 36, 63, 82, 99};
        int maxNum = arr[0];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println("The Maximum Number in this linearsearch.Array is: " + maxNum);
    }
}


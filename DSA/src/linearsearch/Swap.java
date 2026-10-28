package linearsearch;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // linearsearch.Swap 1st and 3rd Index of the following linearsearch.Array
        int[] arr = {12,23,63,59};
//        swap(arr, 0,1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Reverse the array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

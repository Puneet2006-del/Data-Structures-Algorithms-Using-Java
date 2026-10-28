package Sorting;

import java.util.Arrays;

// Selection Sort is a simple comparison-based sorting algorithm.
// It works by repeatedly selecting the smallest element from the
// unsorted part of the array and placing it at the correct position in the sorted part.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3}; // sort this array using selection sort technique.
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int last = arr.length - i - 1;
            int maxNum = maxIndex(arr,0,last);
            swap(arr,maxNum,last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[start] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}





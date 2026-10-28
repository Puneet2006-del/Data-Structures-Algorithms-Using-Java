package Sorting;

import java.util.Arrays;

public class BubbleSort {
    // Bubble Sort: The Bubble Sort algorithm is one of the simplest sorting algorithms in computer science.
    // It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
    // This process continues until the list is sorted.Its name comes from the way smaller elements "bubble" to the top of the list.
    //  It is not suitable for large data sets. Also known as sinking sort or exchange sort.

    public static void main(String[] args) {
        int[] arr = {5,4,2,1,3}; // sort this array using bubble sort technique.
        bubbleSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void bubbleSortAlgo(int[] arr){
       boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}


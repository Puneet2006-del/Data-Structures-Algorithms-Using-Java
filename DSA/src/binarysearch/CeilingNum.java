package binarysearch;

//  A ceiling number refers to the ceiling function,
//  which is a mathematical function that rounds a number up to the nearest integer.
//  It is denoted as ⌈x⌉ or ceil(x), where x is the input number,
//  For example, the ceiling of 2.31 is 3, and the ceiling of -2.31 is -2.

public class CeilingNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceiling(arr,15));

    }
    static int ceiling(int[] arr, int target){
        // If the target is greater than the last number of the array,
        // No Ceiling
        if(target>arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }
}

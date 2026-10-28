package binarysearch;

public class Peak_Index_Mountain_Array {
    public static void main(String[] args) {
//  Mountain Array: A mountain array is an array of integers that first strictly increases to a peak
                // and then strictly decreases, with a minimum length of three elements.

        // Question: Find peak (Maximum Value) in a Mountain array
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static  int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                // You are in the decreasing part of the array
                // This might be the answer, but look at the left
                // This is why end != mid - 1
                end = mid;
            }else{
                // You are in the ascending part of the array
                // Because we know mid + 1 element > mid-element
                start = mid + 1;
            }
        }
        // In the end, start == end and pointing to the largest number
        return start;
    }
}

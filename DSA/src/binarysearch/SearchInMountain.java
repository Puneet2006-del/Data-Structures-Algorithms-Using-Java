package binarysearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in the second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // Use a simple boolean check
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending logic: target > arr[mid] means target is on the LEFT
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}


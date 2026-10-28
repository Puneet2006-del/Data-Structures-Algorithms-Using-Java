package binarysearch;

public class InfiniteNumArray {
    public static void main(String[] args) {
        // Find the element in infinite number array (means without knowing the first index and don't use arr.length)
        int[] arr = {3,5,7,9,10,90,100,130,140,167,176,183};
        System.out.println(answer(arr,90));
    }

    static int answer(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            int newEnd = start + (end - start + 1) * 2;
            start =  newStart;
            end = newEnd;
        }
        return binarySearch(arr,target,start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) /2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

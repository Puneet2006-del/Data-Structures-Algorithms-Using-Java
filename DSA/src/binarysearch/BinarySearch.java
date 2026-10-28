package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] rollNum = {2,4,6,8,10,12,14,16,18,20,23,29,30,31,34,39,40,45,49,50};// sorted array
        System.out.println(binarySearch(rollNum,46));
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end  = arr.length - 1;
        while (start <= end){
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exide the limitation of int
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start =  mid + 1;
            }else{
                // answer found
                return mid;
            }
        }
        // means the element does not exist in this array
        return - 1;
    }
}


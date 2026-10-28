package binarysearch;

public class RotatedArray {
    // Search in this rotated array and the array has distinct elements.
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2}; // means it has not any duplicate values.
        System.out.println(findPivot(arr));
        System.out.println(findingTargetUsingPivot(arr,0));
    }
    static int findingTargetUsingPivot(int[] arr, int target){
        int pivot = findPivot(arr);

        if (pivot == -1){
            return binarySearch(arr,target,0,arr.length - 1);
        }
        if (arr[pivot] == target){
            return pivot;
        } else if (arr[0] <= target) {
            return binarySearch(arr,target,0,pivot - 1);
        }else{
            return binarySearch(arr,target,pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start =  mid + 1;
            }else{
                return mid;
            }
        }
        return - 1;
    }

//    int[] arr = {4, 5, 6, 7, 0, 1, 2};
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] > arr[mid]) {
                end =  mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return - 1;
    }
}
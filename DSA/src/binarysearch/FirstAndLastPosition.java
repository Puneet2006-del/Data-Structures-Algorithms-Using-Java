package binarysearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        //find the first and last position of number 7.
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int first = findFirst(arr,target);
        int last = findLast(arr,target);
        System.out.println(first);
        System.out.println(last);
    }
    static int findFirst(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findLast(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                ans = mid;
                start =  mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}

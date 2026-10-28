package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {1000000, 800000, 70000, 6000, 500, 100 , 50, 20, 10};
        int[] arr = {1,2,3,4,6,70,80,96};
        System.out.println(deScendingSearch(nums,20));
        System.out.println(deScendingSearch(arr,6));
    }

    static int deScendingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

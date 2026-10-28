package linearsearch;

public class Linear_Search_Algorithm {
    // Linear Search Algorithm:
    // Linear search checks each element of the list one by one from the beginning
    // to the end until the desired value is found or the list finishes.
    public static void main(String[] args) {
        int[] arr = {45,23,85,96,36,74,14,26};
        int[] rollNum = {1,2,3,4,5,18,36,21,34};
        // Find whether 85 exists in this array or not.
        // If it does not found, it will return -1.
        // Best Case the time will be constant = O(1)
        // Worst Case the time will depend on the size of the array = O(n)
        int target = 96;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
        System.out.println(linearSearch(rollNum,10));
    }
    // Search the item in this array:
    // if item found, return the index of that item.
    // If item does not found return -1.
    static int linearSearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (target == element){
                return i; // Because 'i' is an Index.
            }
        }
        // If none of the above return functions execute.
        return -1;
    }
}

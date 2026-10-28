package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        // Search for 3 in the range of Index[1,4]
        int target = 3;
        int ans = linearSearch(arr,target,1,4);
        System.out.println(ans);
    }
    static int linearSearch(int arr[], int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++){
            int element = arr[i];
            if (target == element){
                return i; // Because 'i' is an Index.
            }
        }
        // If none of the above return functions execute.
        return -1;
    }
}

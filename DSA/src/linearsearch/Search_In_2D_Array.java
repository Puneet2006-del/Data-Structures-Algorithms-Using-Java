package linearsearch;

import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {12,63,78},
                {96,32,41,46},
                {45,63,74}
        };
        int target = 46;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return null;
    }
}

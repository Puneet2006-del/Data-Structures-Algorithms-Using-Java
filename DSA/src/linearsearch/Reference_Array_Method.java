package linearsearch;

import java.util.Arrays;

public class Reference_Array_Method {
    public static void main(String[] args) {
        int[] num = {45,23,78,96};
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 100;
    }
}

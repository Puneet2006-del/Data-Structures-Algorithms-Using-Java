
import java.util.Arrays;

public class RemoveDuplicate {
    // Write a java program that remove's the duplicate numbers in a list.
    public static void main(String[] args){
        int[] numbers = {4,1,2,3,4,3,5};
        Arrays.sort(numbers);

        int n = numbers.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++){
            if (numbers[i] != numbers[i + 1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[n - 1];
        int[] uniqueNumbers = Arrays.copyOf(temp, j);
        System.out.println("Original numbers are: " + Arrays.toString(numbers));
        System.out.println("List without Duplicate numbers is: " + Arrays.toString(uniqueNumbers));
    }
}

import java.util.Arrays;

public class FibonacciSeries {
    // Write a Java program that generates the first 10 numbers in the Fibonacci sequence.
    public static void main(String[] args){
        int[] num = new int[10];
        // 0 1 1 2 3 5 8 13
        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i < num.length; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        System.out.println("Fibonacci Sequence: " + Arrays.toString(num));
    }
}


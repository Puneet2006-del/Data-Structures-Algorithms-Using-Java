package String_StirngBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new int[]{10,20,30,40}));
        float num = 456.987555f;
//        System.out.printf("Formatted Number is %.2f\n", num);
//        System.out.printf("PI: %.2f\n", Math.PI); // %.f is placeholder for the value
        // String Example
//        System.out.printf("Hii my name is %s and I am  a %s","Puneet","Developer\n");
        // %s is a placeholder for String "Puneet" and "Developer".

        String series = "";
        for (int i = 0; i <26; i++) {
            char ch = (char)('a' + i);
//            System.out.println(ch);
            series = series + ch;
            System.out.println(series);
        }

    }
}

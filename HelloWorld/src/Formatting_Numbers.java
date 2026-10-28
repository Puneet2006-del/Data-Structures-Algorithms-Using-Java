import java.sql.Array;
import java.text.NumberFormat;
import java.util.Arrays;



public class Formatting_Numbers {
    public static void main(String[] args){
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(457852.4563);
//        System.out.println(result);

        String result = NumberFormat.getPercentInstance().format(0.1); // Method Chaining
        System.out.println(result);
    }
}

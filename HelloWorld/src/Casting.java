public class Casting {
    public static void main(String[] args){

        // Implicit Casting: Automatic Conversion
        // byte> short> int> long> float> double
//        double x = 1.5;
//        double y = x + 2; // 2.0
//        System.out.println(y);

        // Explicit Casting
//        double x = 1.5;
//        int y = (int)x + 2;
//        System.out.println(y);
        // Explicit Casting can only happen between compatible types like all these are numbers.

        String x = "5";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
        // To convert a string to a number we have wrapper classes.(ParseInt) etc.
    }
}

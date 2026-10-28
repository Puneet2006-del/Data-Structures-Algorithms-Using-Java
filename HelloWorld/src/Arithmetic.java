public class Arithmetic {
    public static void main(String[] args){
        // Arithmetic Expressions
        double result = (double)13 / (double)5; // Expression which provide a piece of code
        System.out.println("You have got " + result);
//        int x = 1;
//        int y = x++;
//        System.out.println(x); // First x value assigned to y then x will increment by 1
//        System.out.println(y); // Result = x: 2, y: 1

        int x = 1;
        int y = ++x;
        System.out.println(x); // First value of x will increment then x value assign to y
        System.out.println(y); // Result =  x: 2, y: 2

        // Order of operators: (), /*, +-
    }
}

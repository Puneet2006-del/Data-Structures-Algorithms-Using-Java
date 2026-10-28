public class Ternary {
    // Ternary Operator
    public static void main(String[] args){
        int income = 120_000;
        String className = (income>100_000 ? "First" : "Economy"); // Ternary Operators "? and :"
//        if(income > 100_000)
//            className = "First";
//        else
//            className = "Economy"; // To simplify this we use ternary operators.
        System.out.println(className);
    }
}

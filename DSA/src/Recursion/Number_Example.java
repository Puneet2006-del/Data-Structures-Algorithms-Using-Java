package Recursion;

public class Number_Example {
    public static void main(String[] args) {
        // Write a function that takes input a number and prints it.
        // Print the first 5 numbers: 1,2,3,4,5.
        printNum1(1);
    }
    static void printNum1(int n){
        if(n==5){ // Base Condition: Condition where recursion will stop making new calls.
            System.out.println(5); // No Base Condition means infinite function call (stack overflow error).
            return;
        }
        System.out.println(n);
        printNum1(n+1); // Recursion means a function that called itself.
        // Recursive Call
        // if you are calling a function again and again, you can treat it as a separate call in the stack.

    }

    // Why do we need Recursion?
    // It helps us to solve bigger complex problems in a simple way.
    // You can convert recursion solutions into iteration(loops) and vice versa.
    // Space Complexity is not constant because of recursive calls.
    // Breaks bigger problems into smaller problems.




//    static void printNum2(int n){
//        System.out.println(n);
//        printNum3(3);
//    }
//    static void printNum3(int n){
//        System.out.println(n);
//        printNum4(4);
//    }
//    static void printNum4(int n){
//        System.out.println(n);
//        printNum5(5);
//    }
//    static void printNum5(int n){
//        System.out.println(n);
//    }
}

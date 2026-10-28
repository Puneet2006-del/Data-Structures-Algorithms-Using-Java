package Recursion;

public class Fibonacci_Number {
    // Find the nth fibonacci number.
    public static void main(String[] args) {
        System.out.println(fibo(4));

    }

    static int fibo(int n){
        // Base Condition
        if (n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // How to understand and approach a recursion problem.
    // Step 1 = Identify if you can break down the problem into smaller problems.
    // Step 2 = Write the recurrence relation if needed.
    // Step 3 = Draw the recursive tree.
    // Step 4 = About the tree:
            //  See the flow of function, how they are getting in stack.
            //  Identify and focus on left tree calls and right tree calls.
            //  Draw the tree and pointer again and again using pen and paper.
            //  Use a debugger to see the flow.
    // Step 5 = See how the values, what type of values (int, string, etc.) are returned at each step.
    //          See where the function call will out, in the end
    //          you will come out of the main function.
}

// Working with variables in recursion

// Variables = Arguments, ReturnType, Body of the Function.

// Binary Search With Recursion => F(N) = O(1) + F(N/2) (It is recurrence relation).
// 0(1) (Comparison) and F(N/2) (Dividing array into 2 parts)


// Types of Recurrence Relation
// Linear recurrence relation (fibonacci number).
// Divide and conquer recurrence relation (Binary Search).


// Dynamic Programming = If in the recursive calls two or more recursive calls are doing same work
                      // don't compute it again and again.
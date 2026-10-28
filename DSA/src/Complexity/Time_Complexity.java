package Complexity;

public class Time_Complexity {
//    Time Complexity != Time Taken (to execute a program)
    // Time complexity is a function that give us the relationship about how the time will to grow as the input grows.
    // So why this relationship is important?
    // Cause for the same amount of data O(n) is taking most time then O(log n) and then O(1)
    // Basically it's used to compare two or more algorithms that which one is taking less time.
    // O(1) constant time complexity.
    // O(n) Linear time.
    // O(log n) Logarithmic Time (The runtime increases slowly as input size grows).
    // N = size

    // Procedure for Analyzing Complexity:
    // Always look for worst case complexity when designing your algorithms.
    // Always look at the complexity for large or infinity data.
    // We only care about actual time.
    // And this is why we ignore all the constants.
    // Always ignore less dominating terms.

    // Big Oh Notation
    // Ex algo time complexity = O(n^3) so it will never exceed more than n^3 time,it can be better but will never exceed.

    // Big Omega Notation
    // Opposite of Big Oh Notation means Omega(n^3) algo will take at least n^3 time complexity

    // Big Theta Notation
    // A function f(n) is said to be in \Theta (g(n)) if and only if there exist positive constants c_1, c_2, and n_0 such that:
    // c_1\cdot g(n)\leq f(n)\leq c_2\cdot g(n)\quad \mathrm{for\  all\  }n\geq n_0
}

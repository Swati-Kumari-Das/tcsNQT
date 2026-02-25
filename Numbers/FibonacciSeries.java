/**
 * File Name: Fibonacci.java
 * Author: Swati Kumari Das
 *
 * Approach:
 * Fibonacci sequence is defined as:
 * F(0) = 0
 * F(1) = 1
 * F(N) = F(N-1) + F(N-2)
 *
 * We use recursion to solve the problem.
 * Each function call computes fibonacci(N-1) and fibonacci(N-2)
 * until it reaches the base case.
 *
 * Example:
 * fibonacci(4)
 * = fibonacci(3) + fibonacci(2)
 * = (fibonacci(2) + fibonacci(1)) + (fibonacci(1) + fibonacci(0))
 * = (1 + 1) + (1 + 0)
 * = 3
 *
 * Time Complexity (TC): O(2^N)
 * Explanation:
 * Each call creates two recursive calls.
 * Total calls grow exponentially.
 *
 * Space Complexity (SC): O(N)
 * Explanation:
 * Maximum recursion stack depth is N.
 */

publicger class Fibonacci {

    // Recursive function to find Nth Fibonacci number
    public static int fibonacci(int N) {

        // Base Case
        if (N <= 1) {
            return N;
        }

        // Recursive Case
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static void main(String[] args) {

        int N = 6;

        // Function call
        int result = fibonacci(N);

        // Output result
        System.out.println("Fibonacci number at position " + N + " is: " + result);
    }
}

/**
 * Optimized Fibonacci using Iteration
 *
 * Approach:
 * Use two variables to store previous two values.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class FibonacciOptimized {

    public static int fibonacci(int N) {

        if (N <= 1)
            return N;

        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= N; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int N = 6;

        System.out.println("Fibonacci number at position " + N + " is: " + fibonacci(N));
    }
}

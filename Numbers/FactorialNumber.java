/**
 * File Name: Factorial.java
 * Author: Swati Kumari Das
 *
 * Approach:
 * Factorial of a number X is defined as:
 *
 * X! = X × (X-1) × (X-2) × ... × 2 × 1
 *
 * Example:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * We use an iterative approach:
 * 1. Initialize result = 1
 * 2. Loop from 1 to X
 * 3. Multiply result with each number
 * 4. Return result
 *
 * Time Complexity (TC): O(N)
 * Explanation:
 * Loop runs from 1 to N.
 *
 * Space Complexity (SC): O(1)
 * Explanation:
 * No extra space is used, only one variable.
 */

public class Factorial {

    // Function to calculate factorial of a number
    public static int factorial(int X) {

        int ans = 1;

        // Loop from 1 to X
        for (int i = 1; i <= X; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {

        int X = 5;

        int result = factorial(X);

        System.out.println("The factorial of " + X + " is " + result);
    }
}

/**
 * Recursive Factorial
 *
 * Approach:
 * factorial(N) = N × factorial(N-1)
 *
 * Base case:
 * factorial(0) = 1
 * factorial(1) = 1
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)  // recursion stack
 */

public class FactorialRecursive {

    public static int factorial(int N) {

        // Base case
        if (N <= 1)
            return 1;

        // Recursive case
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {

        int X = 5;

        System.out.println("The factorial of " + X + " is " + factorial(X));
    }
}
import java.math.BigInteger;

/**
 * File Name: FactorialBigInteger.java
 * Author: Swati Kumari Das
 *
 * Approach:
 * Normal int and long overflow for large factorial values.
 *
 * int max:        12!
 * long max:       20!
 *
 * To handle large numbers, we use BigInteger class from java.math package.
 *
 * Steps:
 * 1. Initialize result as BigInteger.ONE
 * 2. Loop from 1 to N
 * 3. Multiply result with each number using BigInteger.multiply()
 * 4. Return result
 *
 * Example:
 * 5! = 120
 * 25! = 15511210043330985984000000
 *
 * Time Complexity (TC): O(N)
 *
 * Space Complexity (SC): O(1)
 * (Ignoring output storage)
 */

public class FactorialBigInteger {

    // Function to calculate factorial using BigInteger
    public static BigInteger factorial(int N) {

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {

        int N = 25;

        BigInteger result = factorial(N);

        System.out.println("Factorial of " + N + " is:");
        System.out.println(result);
    }
}

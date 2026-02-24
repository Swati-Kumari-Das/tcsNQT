/*
Program: Check if a number is Prime

A prime number is a number greater than 1 that has only two factors:
1 and itself.

Example:
2 → Prime
3 → Prime
4 → Not Prime
7 → Prime

--------------------------------------------------
APPROACH (Optimized)

Instead of checking from 2 to n-1,
we check from 2 to √n.

Why?
Because if a number has a factor greater than √n,
the other factor must be smaller than √n.

This reduces time complexity significantly.

Steps:
1. If n <= 1 → not prime
2. Loop from i = 2 to √n
3. If n % i == 0 → not prime
4. Else → prime

--------------------------------------------------
EXAMPLE

Input: n = 7

√7 ≈ 2.64

Check:
7 % 2 ≠ 0

No divisors found → Prime

Output: true

--------------------------------------------------
DRY RUN

Input: n = 10

√10 ≈ 3.16

Check:
10 % 2 = 0 → Not prime

Output: false

--------------------------------------------------
TIME COMPLEXITY

Loop runs till √n

TC = O(√n)

--------------------------------------------------
SPACE COMPLEXITY

No extra space used

SC = O(1)

--------------------------------------------------
*/

class Solution {

    static boolean isPrime(int n) {

        // Step 1: handle edge case
        if (n <= 1) {
            return false;
        }

        // Step 2: check till sqrt(n)
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    // main method for testing
    public static void main(String[] args) {

        int n = 29;

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }

    }
}

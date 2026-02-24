
import java.util.*;

/*
Problem: Prime Pair with Target Sum

Given a number n, find two prime numbers a and b such that:
a + b = n
If multiple pairs exist, return the pair with smallest a.
If no pair exists, return [-1, -1]

--------------------------------------------------
APPROACH (Using Sieve of Eratosthenes)

1. Create a boolean array isPrime[] of size n+1.
   isPrime[i] will tell whether i is prime or not.

2. Initialize all values as true, except 0 and 1 (not prime).

3. Use Sieve of Eratosthenes:
   For each number i from 2 to √n:
      If isPrime[i] is true,
      mark all multiples of i as false.

4. After sieve, all prime numbers are marked true.

5. Now loop from a = 2 to n/2:
      Let b = n - a
      If isPrime[a] and isPrime[b] both true,
      return [a, b]

6. If no pair found, return [-1, -1]

--------------------------------------------------
EXAMPLE

Input: n = 10

Prime numbers up to 10:
2, 3, 5, 7

Check pairs:

a=2, b=8 → 8 not prime
a=3, b=7 → both prime → answer = [3,7]

Output: [3,7]

--------------------------------------------------
DRY RUN

n = 10

isPrime array after sieve:
Index:   0 1 2 3 4 5 6 7 8 9 10
Value:   F F T T F T F T F F F

Loop:

a=2 → b=8 → not prime
a=3 → b=7 → both prime → return [3,7]

--------------------------------------------------
TIME COMPLEXITY

Sieve of Eratosthenes: O(n log log n)
Loop to find pair: O(n)

Total Time Complexity: O(n log log n)

--------------------------------------------------
SPACE COMPLEXITY

Boolean array used: O(n)

--------------------------------------------------
*/

class Solution {

    public static ArrayList<Integer> getPrimes(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        // Edge case
        if (n < 4) {
            result.add(-1);
            result.add(-1);
            return result;
        }

        // Step 1: Create sieve array
        boolean[] isPrime = new boolean[n + 1];

        // Step 2: Initialize all as true
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        // Step 3: Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {

                    isPrime[j] = false;

                }
            }
        }

        // Step 4: Find prime pair
        for (int a = 2; a <= n / 2; a++) {

            int b = n - a;

            if (isPrime[a] && isPrime[b]) {

                result.add(a);
                result.add(b);

                return result;
            }
        }

        // Step 5: If no pair found
        result.add(-1);
        result.add(-1);

        return result;
    }

    // Main function for testing
    public static void main(String[] args) {

        int n = 10;

        ArrayList<Integer> ans = getPrimes(n);

        System.out.println(ans);
    }
}

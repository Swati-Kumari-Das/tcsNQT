import java.util.*;

/*
Problem: Find Prime numbers in a range

Given two integers M and N, return all prime numbers between M and N (inclusive).

--------------------------------------------------
APPROACH

1. Create a helper function isPrime(n):
      - If n <= 1 → not prime
      - Loop from 2 to √n
      - If divisible → not prime
      - Else → prime

2. Loop from M to N:
      - Check each number using isPrime()
      - If prime → add to ArrayList

3. Return the ArrayList

--------------------------------------------------
EXAMPLE

Input:
M = 1, N = 10

Check numbers:
1 → not prime
2 → prime → add
3 → prime → add
4 → not prime
5 → prime → add
6 → not prime
7 → prime → add
8 → not prime
9 → not prime
10 → not prime

Output:
[2, 3, 5, 7]

--------------------------------------------------
DRY RUN (M=2, N=5)

i=2 → prime → add
i=3 → prime → add
i=4 → not prime
i=5 → prime → add

Output:
[2,3,5]

--------------------------------------------------
TIME COMPLEXITY

Prime check takes O(√N)
We check N-M numbers

Total TC = O((N-M) × √N)
Worst case = O(N√N)

--------------------------------------------------
SPACE COMPLEXITY

Only ArrayList used

SC = O(1) auxiliary space
(ignoring output list)

--------------------------------------------------
*/

class Solution {

    // function to check prime
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // function to return prime numbers in range
    ArrayList<Integer> primeRange(int M, int N) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = M; i <= N; i++) {

            if (isPrime(i)) {
                result.add(i);
            }
        }

        return result;
    }

    // main method for testing
    public static void main(String[] args) {

        Solution obj = new Solution();

        int M = 1;
        int N = 10;

        ArrayList<Integer> ans = obj.primeRange(M, N);

        System.out.println(ans);
    }
}

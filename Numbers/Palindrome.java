/*
Problem: Check if a number is Palindrome

A number is called palindrome if it reads the same forward and backward.

Example:
121 → Palindrome
123 → Not Palindrome

--------------------------------------------------
APPROACH

1. Store the original number in a variable (original).
2. Reverse the number using a loop:
     - Extract last digit using n % 10
     - Add digit to reversed number: reversed = reversed * 10 + digit
     - Remove last digit from n using n / 10
3. Compare original and reversed number.
4. If both are equal → Palindrome
   Else → Not Palindrome

--------------------------------------------------
EXAMPLE

Input: n = 121

Step-by-step reversal:

n = 121
digit = 1 → reversed = 1
digit = 2 → reversed = 12
digit = 1 → reversed = 121

Compare:
original = 121
reversed = 121

Output: true

--------------------------------------------------
DRY RUN

Input: n = 123

original = 123
reversed = 0

Iteration 1:
digit = 3
reversed = 3
n = 12

Iteration 2:
digit = 2
reversed = 32
n = 1

Iteration 3:
digit = 1
reversed = 321
n = 0

Compare:
original = 123
reversed = 321

Output: false

--------------------------------------------------
TIME COMPLEXITY

Loop runs for number of digits (d)

TC = O(d)
or O(log10 n)

--------------------------------------------------
SPACE COMPLEXITY

No extra space used

SC = O(1)

--------------------------------------------------
*/

class Solution {

    public boolean isPalindrome(int n) {

        int original = n;
        int reversed = 0;

        while (n > 0) {

            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;

        }

        return original == reversed;
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 121;

        boolean result = obj.isPalindrome(n);

        System.out.println("Is Palindrome: " + result);

    }
}

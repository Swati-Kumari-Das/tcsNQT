/*
Program: Print all Palindrome numbers in a given range

A palindrome number reads same forward and backward.
Example: 121, 1331, 444, etc.

--------------------------------------------------
APPROACH

1. Take start and end of range.
2. Loop through each number from start to end.
3. For each number:
      - Reverse the number
      - Compare reversed with original
4. If both equal → number is palindrome → print it

--------------------------------------------------
EXAMPLE

Input:
start = 10
end = 50

Numbers checked:
10 → not palindrome
11 → palindrome
12 → not palindrome
...
22 → palindrome
33 → palindrome
44 → palindrome

Output:
11 22 33 44

--------------------------------------------------
DRY RUN (Example: 121)

original = 121
reversed = 0

digit = 1 → reversed = 1
digit = 2 → reversed = 12
digit = 1 → reversed = 121

original == reversed → palindrome

--------------------------------------------------
TIME COMPLEXITY

Let n = number of elements in range
Let d = number of digits

TC = O(n × d)
or O(n log10 n)

--------------------------------------------------
SPACE COMPLEXITY

SC = O(1)

--------------------------------------------------
*/

class Solution {

    // function to check palindrome
    public static boolean isPalindrome(int num) {

        int original = num;
        int reversed = 0;

        while (num > 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;

        }

        return original == reversed;
    }

    // function to print palindromes in range
    public static void printPalindromes(int start, int end) {

        System.out.println("Palindrome numbers in range:");

        for (int i = start; i <= end; i++) {

            if (isPalindrome(i)) {

                System.out.print(i + " ");

            }
        }
    }

    // main method
    public static void main(String[] args) {

        int start = 10;
        int end = 200;

        printPalindromes(start, end);

    }
}

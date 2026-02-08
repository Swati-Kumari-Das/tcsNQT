🧠 Problem Statement

Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

1️⃣ Brute Force Approach
🔹 Idea

Traverse the string.

Keep only letters and digits.

Convert everything to lowercase.

Reverse the cleaned string.

Compare original cleaned string with reversed string.

🔹 Code (Brute Force)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        // Step 1: Filter alphanumeric characters and convert to lowercase
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                clean.append(Character.toLowerCase(ch));
            }
        }

        // Step 2: Reverse the cleaned string
        String original = clean.toString();
        String reversed = clean.reverse().toString();

        // Step 3: Compare
        return original.equals(reversed);
    }
}

🔹 Time & Space Complexity

Time: O(n)

Space: O(n) (extra string storage)

2️⃣ Optimized Approach (Two Pointers)
🔹 Idea

Use two pointers (left, right).

Skip non-alphanumeric characters.

Compare characters ignoring case.

Move pointers inward.

No extra space required.

🔹 Code (Optimized)
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

🔹 Time & Space Complexity

Time: O(n)

Space: O(1) (constant space)

✅ Comparison Summary
Approach	Time	Space	Notes
Brute Force	O(n)	O(n)	Easy to understand
Optimized (Two Pointers)	O(n)	O(1)	Best & interview-preferred

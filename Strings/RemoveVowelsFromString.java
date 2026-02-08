Remove Vowels from a String (Java)
🧠 Problem Statement

Given a string s, remove all vowels (a, e, i, o, u) from it and return the resulting string.
Both uppercase and lowercase vowels should be removed.

💡 Approach

Use a StringBuilder to efficiently build the result.

Traverse each character of the string.

Convert the character to lowercase for easy vowel comparison.

Skip the character if it is a vowel.

Append only non-vowel characters to the result.

✅ Java Code
// User function Template for Java

class Solution {
    String removeVowels(String s) {

        // StringBuilder to store result
        StringBuilder result = new StringBuilder();

        // Traverse each character
        for (char ch : s.toCharArray()) {

            // Convert to lowercase for vowel check
            char lower = Character.toLowerCase(ch);

            // Skip vowels
            if (lower == 'a' || lower == 'e' || lower == 'i' ||
                lower == 'o' || lower == 'u') {
                continue;
            }

            // Append non-vowel characters
            result.append(ch);
        }

        return result.toString();
    }
}

⏱️ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(n) (for the result string)

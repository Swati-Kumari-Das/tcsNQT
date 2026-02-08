Remove All Characters Other Than Alphabets (Java)
🧠 Problem Statement

Given a string S, remove all characters except alphabets (A–Z, a–z).
If the resulting string contains no alphabets, return "-1".

💡 Approach

Use a StringBuilder to efficiently build the result.

Traverse each character in the string.

Keep only alphabetic characters using Character.isLetter().

If no alphabets are found, return "-1".

✅ Java Code
// User function Template for Java

class Solution {
    String removeSpecialCharacter(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }

        // If no alphabets remain
        if (result.length() == 0) {
            return "-1";
        }

        return result.toString();
    }
}

⏱️ Time & Space Complexity

Time Complexity: O(n)

Auxiliary Space: O(n)

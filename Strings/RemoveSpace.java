Remove Spaces from a String (Java)
🧠 Problem Statement

Given a string s, remove all spaces from it and return the modified string.

💡 Approach

Use a StringBuilder to efficiently construct the result.

Traverse each character of the string.

Skip space characters (' ').

Append all other characters to the result.

✅ Java Code
// User function Template for Java
class Solution {
    String modify(String s) {

        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                continue; // skip spaces
            }
            result.append(ch);
        }

        return result.toString();
    }
}

⏱️ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(n) (for the output string)

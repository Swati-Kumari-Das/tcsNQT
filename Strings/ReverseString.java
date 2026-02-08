🔁 Reverse a String (Java)
📌 Problem Statement

Given a string s, return its reverse.

🧪 Brute Force Approach
 Idea

Iterate from the end of the string and keep appending characters to a new string.

class Solution {
    public static String reverseString(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        return res;
    }
}

⏱ Complexity

Time Complexity: O(n²) (due to immutable strings)

Space Complexity: O(n)

❌ Not efficient for large strings.

⚡ Optimized Approach (Using StringBuilder)
🔍 Idea

Use StringBuilder (mutable) to efficiently build the reversed string.

💻 Code
class Solution {
    public static String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            res.append(arr[i]);
        }
        return res.toString();
    }
}

⏱ Complexity

Time Complexity: O(n)

Space Complexity: O(n)

✅ Efficient and preferred.

⭐ Best Approach (Built-in Method)
🔍 Idea

Leverage Java’s built-in reverse() method of StringBuilder.

💻 Code
class Solution {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

⏱ Complexity

Time Complexity: O(n)

Space Complexity: O(n)

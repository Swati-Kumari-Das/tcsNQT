🔢 Sum of Numbers in a String (Java)
📌 Problem Statement

Given a string containing alphabets and digits, calculate the sum of all numbers present in the string.

Examples
Input:  "123xyz"
Output: 123

Input:  "1xyz23"
Output: 24

🧪 Brute Force Approach
🔍 Idea

Traverse the string character by character

Build numbers using string concatenation

Whenever a non-digit appears, convert the collected number and add it to the sum

💻 Code (Brute Force)
class Solution {
    public int sumOfNumbers(String s) {
        int sum = 0;
        String temp = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c; // string concatenation
            } else {
                if (!temp.equals("")) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        if (!temp.equals("")) {
            sum += Integer.parseInt(temp);
        }

        return sum;
    }
}

⏱ Complexity

Time Complexity: O(n²) (due to string concatenation in loop)

Space Complexity: O(n)

❌ Not optimal for large inputs.

⚡ Optimized Approach (Using StringBuilder)
🔍 Idea

Use StringBuilder instead of String

Avoid repeated memory allocation

Convert accumulated digits only when needed

💻 Code (Optimized)
class Solution {
    public int sumOfNumbers(String s) {
        int sum = 0;
        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp.append(c);
            } else {
                if (temp.length() > 0) {
                    sum += Integer.parseInt(temp.toString());
                    temp.setLength(0); // reset
                }
            }
        }

        if (temp.length() > 0) {
            sum += Integer.parseInt(temp.toString());
        }

        return sum;
    }
}

⏱ Complexity

Time Complexity: O(n)

Space Complexity: O(n)

✅ Efficient
✅ Interview-friendly
✅ Recommended

🏆 Best Approach (Without Extra Space)
🔍 Idea

Build numbers mathematically instead of using strings

💻 Code (Most Optimized)
class Solution {
    public int sumOfNumbers(String s) {
        int sum = 0, num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                sum += num;
                num = 0;
            }
        }
        return sum + num;
    }
}

⏱ Complexity

Time Complexity: O(n)

Space Complexity: O(1)

⭐ Best possible solution

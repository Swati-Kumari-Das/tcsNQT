// Solution class for removing brackets
class Solution {
    // Function to remove all brackets
    public String removeBrackets(String expr) {
        // StringBuilder for result
        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (char ch : expr.toCharArray()) {
            // Append if not a bracket
            if (ch != '(' && ch != ')') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Input expression
        String expression = "a+(b*c)-(d/e)";

        // Create Solution object
        Solution sol = new Solution();

        // Get result
        String result = sol.removeBrackets(expression);

        // Print result
        System.out.println("Expression without brackets: " + result);
    }
}

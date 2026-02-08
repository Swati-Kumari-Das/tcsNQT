class Solution {
    // Function to count vowels, consonants, and white spaces in a string
    public void solve(String str) {
        // Variables to store counts
        int vowels = 0, consonants = 0, whitespaces = 0;

        // Convert string to lowercase
        str = str.toLowerCase();

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            // Check for consonants
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
            // Check for white spaces
            else if (ch == ' ')
                whitespaces++;
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White Spaces: " + whitespaces);
    }
}

public class Main {
    public static void main(String[] args) {
        // Input string
        String str = "Take u forward is Awesome";

        // Create Solution object
        Solution obj = new Solution();

        // Call the function
        obj.solve(str);
    }
}

import java.util.*;

/**
 * File Name: Main.java
 *
 * Description:
 * This program reads a list of integers from user input in the format [1,2,3,4],
 * converts the input into an ArrayList of integers, and prints the elements.
 *
 * Example Input:
 * [10,20,30,40]
 *
 * Example Output:
 * 10 20 30 40
 *
 * Author: Your Name
 * Date: 2026
 */

public class Main {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read input string (example: [1,2,3,4])
        String input = sc.nextLine();

        // Remove square brackets if present
        if (input.startsWith("[") && input.endsWith("]")) {
            input = input.substring(1, input.length() - 1);
        }

        // Split string by comma
        String[] s = input.split(",");

        // Create ArrayList to store integers
        ArrayList<Integer> arr = new ArrayList<>();

        // Convert each string token into integer
        for (String token : s) {
            int num = Integer.parseInt(token.trim());
            arr.add(num);
        }

        // Print ArrayList elements
        System.out.println("ArrayList elements are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Close Scanner
        sc.close();
    }
}

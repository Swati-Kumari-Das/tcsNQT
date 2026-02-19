import java.util.*;

/**
 * Main.java
 *
 * This program reads a comma-separated list of integers from the user,
 * converts them into an ArrayList, and prints the elements.
 *
 * Example Input:
 * 10,20,30,40
 *
 * Example Output:
 * 10 20 30 40
 *
 */

public class Main {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read comma-separated input as a string
        String input = sc.nextLine();

        // Split the string using comma
        String[] ch = input.split(",");

        // Create ArrayList to store integers
        ArrayList<Integer> arr = new ArrayList<>();

        // Convert each string to integer and add to ArrayList
        for (String c : ch) {
            int num = Integer.parseInt(c.trim()); // trim removes extra spaces
            arr.add(num);
        }

        // Print the ArrayList elements
        System.out.println("Array elements are:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // Close scanner
        sc.close();
    }
}

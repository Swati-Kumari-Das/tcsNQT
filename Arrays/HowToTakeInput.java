import java.util.*;

/**
 * Main.java
 * 
 * This program reads an integer n from the user,
 * then reads n integers into an array,
 * and prints the array elements.
 * 
 * Author: Your Name
 * Date: 2026
 */

public class Main {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int n = sc.nextInt();

        // Declare array of size n
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");
        for (int a : arr) {
            System.out.print(a + " ");
        }

        // Close scanner
        sc.close();
    }
}

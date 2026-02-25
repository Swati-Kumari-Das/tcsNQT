import java.util.HashMap;

/**
 * File Name: SubsetCheck.java
 * Author: Swati Kumari Das
 *
 * Problem:
 * Check whether array b[] is a subset of array a[].
 *
 * A subset means every element of b[] must exist in a[]
 * with at least the same frequency.
 *
 * Example:
 * a = {1,2,3,4,5}
 * b = {2,4,5}
 * Output: true
 *
 * a = {1,2,3,4,5}
 * b = {2,4,6}
 * Output: false
 *
 * Approach:
 * 1. Use HashMap to store frequency of elements in array a[]
 * 2. Traverse array b[]
 * 3. For each element in b[]:
 *      • Check if it exists in map
 *      • Check if frequency > 0
 *      • Reduce frequency
 * 4. If any element missing → return false
 * 5. Otherwise → return true
 *
 * Time Complexity (TC): O(N + M)
 * N = size of array a
 * M = size of array b
 *
 * Space Complexity (SC): O(N)
 * For storing frequency map
 */

public class SubsetCheck {

    public static boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of elements in array a
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check elements of array b
        for (int num : b) {

            if (!map.containsKey(num) || map.get(num) == 0) {
                return false;
            }

            map.put(num, map.get(num) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = {2, 4, 5};

        boolean result = isSubset(a, b);

        if (result)
            System.out.println("b is subset of a");
        else
            System.out.println("b is NOT subset of a");
    }
}

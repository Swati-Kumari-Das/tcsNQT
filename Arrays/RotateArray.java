/**
 * Rotate Array Left by d positions (In-place)
 *
 * Approach: Reversal Algorithm
 *
 * Steps:
 * 1. Reverse first d elements
 * 2. Reverse remaining n-d elements
 * 3. Reverse entire array
 *
 * Example:
 * arr = [1,2,3,4,5], d=2
 * Output = [3,4,5,1,2]
 *
 * Time Complexity (TC): O(N)
 * Space Complexity (SC): O(1)
 */

class Solution {

    static void rotateArr(int arr[], int d) {

        int n = arr.length;

        // Handle cases where d > n
        d = d % n;

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 2: Reverse remaining elements
        reverse(arr, d, n - 1);

        // Step 3: Reverse whole array
        reverse(arr, 0, n - 1);
    }

    // Helper function to reverse array
    static void reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

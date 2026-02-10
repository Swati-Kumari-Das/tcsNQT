Min and Second Minimum Element in an Array

Problem:
Given an array of integers, find the smallest and second smallest distinct elements.
If the second smallest does not exist, return -1.

✅ Java Implementation
import java.util.ArrayList;

class Solution {

    /**
     * Finds the minimum and second minimum distinct elements in the array.
     *
     * @param arr input integer array
     * @return ArrayList containing smallest and second smallest elements,
     *         or [-1] if second smallest does not exist
     */
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        // If array has less than 2 elements, second minimum cannot exist
        if (arr.length < 2) {
            result.add(-1);
            return result;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Update smallest and second smallest
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            // Update second smallest if distinct and smaller
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        // If second smallest was never updated
        if (secondSmallest == Integer.MAX_VALUE) {
            result.add(-1);
        } else {
            result.add(smallest);
            result.add(secondSmallest);
        }

        return result;
    }
}

⏱ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(1) (excluding output list)

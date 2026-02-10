Reverse an Array In-Place
📌 Problem Statement

Given an integer array, reverse the array in-place without using any extra array.

💡 Approach (Two-Pointer Technique)

We use two pointers:

start → points to the beginning of the array

end → points to the end of the array

Steps:

Initialize start = 0 and end = arr.length - 1

While start < end:

Swap the elements at start and end

Move start forward

Move end backward

Continue until both pointers meet

This reverses the array efficiently without extra memory.

✅ Java Implementation
class Solution {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

⏱ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(1)

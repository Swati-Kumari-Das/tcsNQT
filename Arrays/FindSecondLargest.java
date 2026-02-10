Find the Second Largest Element in an Array
📌 Problem Statement

Given an integer array, find the second largest distinct element.
If the second largest element does not exist, return -1.

💡 Approach

We solve this problem in one pass by keeping track of:

largest → the maximum value found so far

secondLargest → the second maximum distinct value

Steps:

Initialize both largest and secondLargest to -1

Traverse the array:

If the current element is greater than largest:

Update secondLargest to largest

Update largest to current element

Else if the element is smaller than largest but greater than secondLargest:

Update secondLargest

Return secondLargest

✅ Java Implementation
class Solution {
    public int getSecondLargest(int[] arr) {
        
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

⏱ Time & Space Complexity

Time Complexity: O(n)

Space Complexity: O(1)

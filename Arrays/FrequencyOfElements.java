Count Frequency of Elements in an Array (Java)

This Java program calculates the frequency of each distinct element in a given integer array using a HashMap.

🚀 Approach

The solution follows three main steps:

1️⃣ Count Frequency (O(n))

Traverse the array.

Store each element in a HashMap<Integer, Integer>.

Increase the count using getOrDefault().

2️⃣ (Optional) Sort Distinct Elements

Extract all unique keys from the HashMap.

Sort them using Collections.sort() if ordered output is required.

3️⃣ Prepare Result

Store each element and its frequency as a pair inside:

ArrayList<ArrayList<Integer>>


Each inner list contains:

[element, frequency]

💻 Code
import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        // Step 1: Count frequency using HashMap (O(n))
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store distinct elements in sorted order (optional)
        ArrayList<Integer> keys = new ArrayList<>(freqMap.keySet());
        Collections.sort(keys);

        // Step 3: Prepare result
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }

        return result;
    }
}

⏱️ Time Complexity
Operation	Complexity
Frequency Counting	O(n)
Sorting (distinct elements)	O(k log k)
Result Preparation	O(k)

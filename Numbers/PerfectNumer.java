/*
Perfect Number Program in Java
------------------------------

APPROACH:
A Perfect Number is a number whose sum of all factors excluding itself equals the number.

Example:
6 → Factors: 1, 2, 3, 6
Exclude 6 → sum = 1 + 2 + 3 = 6 → Perfect Number

Optimized Idea:
Factors always occur in pairs.
Example: 28 → (1,28), (2,14), (4,7)

So instead of checking till n, we check till √n.
For every factor i, we also add n/i (if different).

STEPS:
1. If n <= 1 → return false
2. Initialize sum = 1
3. Loop from i = 2 to √n
4. If n % i == 0:
      add i
      add n/i (if different)
5. If sum == n → Perfect Number

TIME COMPLEXITY (TC):
O(√n)

SPACE COMPLEXITY (SC):
O(1)
*/

import java.util.Scanner;

class Solution {
    
    static boolean isPerfect(int n) {
        
        if(n <= 1) return false;
        
        int sum = 1;
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            
            if(n % i == 0){
                
                sum += i;
                
                if(i != n/i){
                    sum += n/i;
                }
            }
        }
        
        return sum == n;
    }
}

public class PerfectNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(Solution.isPerfect(n)){
            System.out.println(n + " is a Perfect Number");
        }
        else{
            System.out.println(n + " is NOT a Perfect Number");
        }
        
        sc.close();
    }
}

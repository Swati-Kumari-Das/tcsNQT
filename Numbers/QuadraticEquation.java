import java.util.*;

class Solution {
    
    public double[] FindRoots(int A, int B, int C) {
        
        double D = B * B - 4.0 * A * C;
        
        // Case 1: D > 0 → two different real roots
        if (D > 0) {
            double root1 = (-B + Math.sqrt(D)) / (2.0 * A);
            double root2 = (-B - Math.sqrt(D)) / (2.0 * A);
            
            if (root1 < root2)
                return new double[]{root1, root2};
            else
                return new double[]{root2, root1};
        }
        
        // Case 2: D == 0 → one real root (same root twice)
        else if (D == 0) {
            double root = (-B) / (2.0 * A);
            return new double[]{root, root};
        }
        
        // Case 3: D < 0 → no real roots
        else {
            return new double[]{-1};
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input A, B, C
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        Solution obj = new Solution();
        double[] result = obj.FindRoots(A, B, C);
        
        // Output
        if (result.length == 1 && result[0] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(result[0] + ", " + result[1]);
        }
        
        sc.close();
    }
}

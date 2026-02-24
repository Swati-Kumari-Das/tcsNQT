import java.util.Scanner;

class Solution {
    
    static boolean armstrongNumber(int n) {
      
        int original = n;
        int sum = 0;
      
        while(n > 0){
            int ld = n % 10;
            sum += ld * ld * ld;
            n = n / 10;
        }
      
        if(sum == original){
            return true;
        }
        return false;
    }
}

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        
        boolean result = Solution.armstrongNumber(n);
        
        if(result){
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is NOT an Armstrong number");
        }
        
        sc.close();
    }
}

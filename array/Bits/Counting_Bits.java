import java.util.Arrays;

public class Counting_Bits {
   public static void main(String[] args) {

      // Test case: Count bits for numbers from 0 to 5
      int[] result = countBits(5);

      // Display results
      System.out.println("Count of bits for numbers from 0 to 5: " + Arrays.toString(result));
      // Expected output: [0, 1, 1, 2, 1, 2]
   }

   public static int[] countBits(int n) {
      // Create an array to store the results
      int ans[] = new int[n + 1];

      // Iterate through numbers from 0 to n
      for (int i = 0; i <= n; i++) {
         // Calculate the number of bits for the current number using recursion
         ans[i] = rec(i, ans);
      }

      // Return the array containing the count of bits for each number from 0 to n
      return ans;
   }

   // Recursive helper method to count the number of bits for a given number
   public static int rec(int num, int memo[]) {
      // Base case: if num is 0, there are 0 bits
      if (num == 0)
         return 0;
      // Base case: if num is 1, there is 1 bit
      if (num == 1)
         return 1;
      // If the result for num is already calculated, return it from memo
      if (memo[num] != 0)
         return memo[num];

      // If num is even, recursively calculate for num/2
      if (num % 2 == 0) {
         memo[num] = rec(num / 2, memo);
         return memo[num];
      }
      // If num is odd, recursively calculate for num/2 and add 1
      else {
         memo[num] = 1 + rec(num / 2, memo);
         return memo[num];
      }
   }
}

public class MaximumSumArray {
   public static void main(String[] args) {
      // Example usage:
      int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
      int maxSubArraySum = maxSubArray(nums);
      System.out.println("Maximum Subarray Sum: " + maxSubArraySum);
   }

   public static int maxSubArray(int[] nums) {
      // Initialize variables to keep track of the best and current sum
      int best_sum = Integer.MIN_VALUE;
      int curr_sum = 0;

      // Iterate through the array
      for (int i = 0; i < nums.length; i++) {
         // Calculate the current sum using the current element and the previous sum
         curr_sum = Math.max(nums[i], curr_sum + nums[i]);

         // Update the best sum if the current sum is greater
         best_sum = Math.max(best_sum, curr_sum);
      }

      // Return the maximum subarray sum
      return best_sum;
   }
}

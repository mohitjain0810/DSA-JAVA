import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class three_sum {

   // Main method for testing
   public static void main(String[] args) {
      // Example usage:
      int[] nums = { -1, 0, 1, 2, -1, -4 };
      List<List<Integer>> result = threeSum(nums);
      System.out.println(result);
   }

   // Method to find all unique triplets in the array that sum up to zero
   public static List<List<Integer>> threeSum(int[] nums) {
      // Check if the input array is valid for the problem
      if (nums == null || nums.length < 3)
         return new ArrayList<>();

      // Sort the array in ascending order
      Arrays.sort(nums);
      Set<List<Integer>> result = new HashSet<>();

      // Iterate through the array to find triplets
      for (int i = 0; i < nums.length - 2; i++) {
         // Fix the first element and find the other two elements using the two-pointer
         // approach
         int left = i + 1;
         int right = nums.length - 1;

         while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];

            if (sum == 0) {
               // Add the triplet to the result set and move to find other triplets
               result.add(Arrays.asList(nums[i], nums[left], nums[right]));
               left++;
               right--;
            } else if (sum < 0) {
               // If sum is less than zero, move the left pointer to increase the sum
               left++;
            } else {
               // If sum is greater than zero, move the right pointer to decrease the sum
               right--;
            }
         }
      }
      // Convert the set to a list and return the result
      return new ArrayList<>(result);
   }
}

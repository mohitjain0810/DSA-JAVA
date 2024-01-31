public class Majority_element_one {
   // Method to find the majority element in an array
   public static int majorityElement(int[] nums) {
      // Initialize candidate and count
      int candidate = 0;
      int count = 0;

      // Iterate through the array
      for (int i = 0; i < nums.length; i++) {
         // If count becomes 0, update the candidate
         if (count == 0) {
            candidate = nums[i];
         }

         // If the current element is the same as the candidate, increase count;
         // otherwise, decrease count
         if (candidate == nums[i]) {
            count++;
         } else {
            count--;
         }
      }

      // The candidate is the majority element
      return candidate;
   }

   // Main method for testing
   public static void main(String[] args) {

      // Example usage
      int[] nums = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
      int result = majorityElement(nums);

      // Print the result
      System.out.println("The majority element is: " + result);
   }
}
import java.util.ArrayList;
import java.util.List;

public class Majority_element_two {
   public static List<Integer> majorityElement(int[] nums) {
      int number1 = -1, number2 = -1, count1 = 0, count2 = 0, len = nums.length;

      for (int i = 0; i < len; i++) {

         if (nums[i] == number1) {
            count1++;
         } else if (nums[i] == number2) {
            count2++;
         } else if (count1 == 0) {
            // If count1 is 0, update number1 and reset count1
            number1 = nums[i];
            count1++;
         } else if (count2 == 0) {
            // If count2 is 0, update number2 and reset count2
            number2 = nums[i];
            count2++;
         } else {
            // If neither count is 0, decrease both counts (potential majority elements
            // canceled out)
            count1--;
            count2--;
         }
      }

      // Reset counts for the second pass
      count1 = 0;
      count2 = 0;

      // Count occurrences of the potential majority elements
      for (int i = 0; i < len; i++) {
         if (nums[i] == number1) {
            count1++;
         } else if (nums[i] == number2) {
            count2++;
         }
      }

      // Create a list to store the majority elements
      List<Integer> ans = new ArrayList<>();

      if (count1 > len / 3) {
         ans.add(number1);
      }
      if (count2 > len / 3) {
         ans.add(number2);
      }

      // Return the list of majority elements
      return ans;
   }

   // Main method for testing
   public static void main(String[] args) {

      // Example usage
      // int[] nums = { 3, 3, 4, 2, 2, 3, 7, 8, 3, 3 };
      int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };

      List<Integer> result = majorityElement(nums);

      // Print the result
      System.out.println("Majority elements are: " + result);
   }
}

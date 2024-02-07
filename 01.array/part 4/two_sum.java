import java.util.HashMap;

public class two_sum {
   public static int[] twoSum(int[] nums, int target) {
      // Create a HashMap to store the array elements and their indices
      HashMap<Integer, Integer> map = new HashMap<>();

      // Fill the HashMap with array elements and their corresponding indices
      for (int i = 0; i < nums.length; i++) {
         map.put(nums[i], i);
      }

      // Search for pairs that add up to the target
      for (int i = 0; i < nums.length; i++) {
         int num = nums[i];
         int rem = target - num;

         // Check if the complement (target - num) is present in the HashMap
         if (map.containsKey(rem)) {
            int remIndex = map.get(rem);

            // Ensure the two indices are not the same
            if (remIndex == i) {
               continue;
            }

            // Return the indices of the two numbers that add up to the target
            return new int[] { i, remIndex };
         }
      }

      // If no such pair is found, return an empty array
      return new int[] {};
   }

   // Main method for testing
   public static void main(String[] args) {

      // Test case 1
      int[] nums1 = { 2, 7, 11, 15 };
      int target1 = 9;
      int[] result1 = twoSum(nums1, target1);
      System.out.println("Indices for target " + target1 + ": [" + result1[0] + ", " + result1[1] + "]");

      // Test case 2
      int[] nums2 = { 3, 2, 4 };
      int target2 = 6;
      int[] result2 = twoSum(nums2, target2);
      System.out.println("Indices for target " + target2 + ": [" + result2[0] + ", " + result2[1] + "]");
   }
}

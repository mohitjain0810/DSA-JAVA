public class Find_duplicate {
   public static void main(String[] args) {

      int[] nums = { 1, 3, 4, 2, 2 };
      int duplicate = findstheduplicate(nums);
      System.out.println("The duplicate number is: " + duplicate);
   }

   public static int findstheduplicate(int[] nums) {
      int n = nums.length;

      // Traverse the arrays
      for (int i = 0; i < n; i++) {
         // Take the absolute value to handle negative numbers
         int index = Math.abs(nums[i]);
         // If the value at the calculated index is negative, it's the duplicate
         if (nums[index] < 0) {
            return index;
         }
         // Mark the value at the calculated index as visited by making it negative
         nums[index] = -nums[index];
      }
      // If no duplicate is found
      return -1;
   }
}

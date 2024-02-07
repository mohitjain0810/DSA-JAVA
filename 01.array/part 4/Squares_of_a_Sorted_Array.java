public class Squares_of_a_Sorted_Array {
   public static int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      int left = 0, right = n - 1;

      // Iterate through the result array in reverse order
      for (int i = n - 1; i >= 0; i--) {
         // Compare the absolute values of elements at left and right pointers
         if (Math.abs(nums[left]) > Math.abs(nums[right])) {
            // Square and assign the left element to the result
            result[i] = nums[left] * nums[left];
            left++;
         } else {
            // Square and assign the right element to the result
            result[i] = nums[right] * nums[right];
            right--;
         }
      }
      return result;
   }

   // Main method for testing
   public static void main(String[] args) {
      // Example usage
      int[] nums = { -4, -2, 0, 1, 3, 5 };
      int[] result = sortedSquares(nums);

      // Display the sorted squares
      System.out.print("Sorted Squares: [");
      for (int i = 0; i < result.length; i++) {
         System.out.print(result[i]);
         if (i < result.length - 1) {
            System.out.print(", ");
         }
      }
      System.out.println("]");
   }
}

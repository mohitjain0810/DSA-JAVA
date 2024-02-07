public class SortColors {
   public static void main(String[] args) {
      // Example usage:
      int[] nums = { 2, 0, 2, 1, 1, 0 };
      System.out.print("Before Sorted Colors: ");
      printArray(nums);

      sortColors(nums);
      System.out.print("After Sorted Colors: ");
      printArray(nums);
   }

   /**
    * Method to sort an array of colors represented by 0, 1, and 2.
    * 
    * @param nums The input array of colors (0, 1, and 2).
    */
   public static void sortColors(int[] nums) {
      // Initialize counters for each color
      int zero = 0, one = 0, two = 0;

      // Count occurrences of each color
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] == 0)
            zero++;
         else if (nums[i] == 1)
            one++;
         else if (nums[i] == 2)
            two++;
      }

      // Update the array with the sorted colors
      for (int i = 0; i < zero; i++)
         nums[i] = 0;

      for (int i = zero; i < zero + one; i++)
         nums[i] = 1;

      for (int i = zero + one; i < zero + one + two; i++)
         nums[i] = 2;
   }

   // Utility method to print an array
   private static void printArray(int[] arr) {
      for (int num : arr) {
         System.out.print(num + " ");
      }
      System.out.println();
   }
}

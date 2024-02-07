public class NextPermutation {
   public static void main(String[] args) {
      // Example usage:
      int[] nums = { 1, 2, 3 };
      System.out.print("Original array: ");
      printArray(nums);

      nextPermutation(nums);

      System.out.print("Next permutation: ");
      printArray(nums);
   }

   // Method to find the next permutation of an array
   public static void nextPermutation(int[] nums) {
      int n = nums.length;
      int k = n - 2;

      // Null checks
      if (nums.length == 0 || nums == null) {
         return;
      }

      // Find k
      for (int i = n - 1; i > 0; i--) {
         if (nums[i] <= nums[i - 1]) {
            k--;
         } else {
            break;
         }
      }

      // If k==-1, reverse the array
      if (k == -1) {
         reverse(nums, 0, n - 1);
         return;
      }

      // Else replace k with the next permutation element and reverse
      for (int i = n - 1; i > 0; i--) {
         if (nums[i] > nums[k]) {
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            break;
         }
      }
      reverse(nums, k + 1, n - 1);
   }

   // Method to reverse a portion of the array
   public static void reverse(int[] nums, int start, int end) {
      while (start < end) {
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
      }
   }

   // Utility method to print an array
   private static void printArray(int[] arr) {
      for (int num : arr) {
         System.out.print(num + " ");
      }
      System.out.println();
   }
}

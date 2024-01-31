public class Merge_Sorted_array {
   // Main method to merge two sorted arrays
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
      // Initialize pointers for nums1, nums2, and the merged result
      int k = m + n - 1; // Pointer for the merged result
      int j = n - 1; // Pointer for nums2
      int i = m - 1; // Pointer for nums1

      // Merge arrays using two-pointer approach
      while (j >= 0) {
         // If there are elements in nums1 and nums1 element is greater than nums2
         // element
         if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]; // Copy nums1 element to the merged result
            i--; // Move nums1 pointer to the previous element
            k--; // Move merged result pointer to the previous position
         } else {
            nums1[k] = nums2[j]; // Copy nums2 element to the merged result
            j--; // Move nums2 pointer to the previous element
            k--; // Move merged result pointer to the previous position
         }
      }
   }

   // Method to print an array
   public static void printArray(int[] arr) {
      System.out.print("Array: ");
      for (int num : arr) {
         System.out.print(num + " ");
      }
      System.out.println();
   }

   // Main method to test the merge functionality
   public static void main(String[] args) {

      // Test input arrays
      int[] nums1 = { 1, 2, 3, 0, 0, 0 };
      int m = 3;
      int[] nums2 = { 2, 5, 6 };
      int n = 3;

      // Merge the arrays
      merge(nums1, m, nums2, n);

      // Print the merged result
      printArray(nums1);
   }
}
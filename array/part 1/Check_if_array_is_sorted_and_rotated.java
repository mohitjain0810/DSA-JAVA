public class Check_if_array_is_sorted_and_rotated {
   public static void main(String[] args) {
      // Test case 1: Non-circular array
      int[] nums1 = { 4, 2, 3 };
      System.out.println("Test Case 1: " + check(nums1)); // Expected output: true

      // Test case 2: Circular array
      int[] nums2 = { 4, 2, 1, 3 };
      System.out.println("Test Case 2: " + check(nums2)); // Expected output: false
   }

   public static boolean check(int[] nums) {
      int count = 0;
      int n = nums.length;

      for (int i = 1; i < n; i++) {
         if (nums[i - 1] > nums[i]) {
            count++;
         }
      }

      if (nums[n - 1] > nums[0]) {
         count++;
      }

      return count <= 1;
   }
}

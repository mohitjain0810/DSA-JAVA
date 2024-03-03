public class BinarySearch {

   // Big O notation - O(log n)
   public static void main(String[] args) {
      int nums[] = { 5, 6, 7, 8, 9, 10 };
      int target = 9;
      int result = binarySearch(nums, target);
      int result2 = recursiveBinarySearch(nums, target, 0, nums.length - 1);

      if (result != -1)
         System.out.println("Element found at Index : " + result);
      else
         System.out.println("Element not found");

      if (result2 != -1)
         System.out.println("Element found at Index : " + result2);
      else
         System.out.println("Element not found");
   }

   public static int binarySearch(int[] nums, int target) {

      int left = 0;
      int right = nums.length - 1;

      while (left <= right) {

         int mid = left + (right - left) / 2;

         if (nums[mid] == target) 
            return mid;
          else if (nums[mid] < target) 
            left = mid + 1;
          else 
            right = mid - 1;
      }
      return -1;
   }

   public static int recursiveBinarySearch(int[] nums, int target, int left, int right) {
      if (left <= right) {
         int mid = left + (right - left) / 2;
         if (nums[mid] == target)
            return mid;
         else if (nums[mid] < target)
            return recursiveBinarySearch(nums, target, mid + 1, right);
         else
            return recursiveBinarySearch(nums, target, left, mid - 1);
      }
      return -1;
   }
}

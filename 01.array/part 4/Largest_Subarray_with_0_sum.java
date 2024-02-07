import java.util.HashMap;

public class Largest_Subarray_with_0_sum {
   // Method to find the maximum length subarray with sum zero
   public static int maxLen(int arr[], int n) {
      // Create HashMap to store the suffix sum and its index
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      int maxLength = 0;
      int currentSum = 0;

      // Traverse the input array
      for (int i = 0; i < arr.length; i++) {
         // Update the current sum
         currentSum += arr[i];

         // Check if the current sum is zero
         if (currentSum == 0) {
            // If so, update the maximum length
            maxLength = i + 1;
         } else {
            // If the current sum doesn't exist in the HashMap, store it with its index
            if (map.get(currentSum) != null) {
               maxLength = Math.max(maxLength, i - map.get(currentSum));
            } else {
               map.put(currentSum, i);
            }
         }
      }

      // Return the maximum length of the subarray with sum zero
      return maxLength;
   }

   
   public static void main(String[] args) {

      // Example usage
      int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
      int maxLength = maxLen(arr, arr.length);

      // Display the result
      System.out.println("Maximum length of subarray with sum zero: " + maxLength);
   }
}

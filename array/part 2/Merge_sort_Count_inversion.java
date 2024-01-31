public class Merge_sort_Count_inversion {
   public static long getInversions(long arr[]) {
      // Create a temporary array to store the sorted elements during the merge
      // process
      long[] temp = new long[arr.length];
      // Call the helper method to perform merge sort and count inversions
      return mergeSort(arr, temp, 0, arr.length - 1);
   }

   /**
    * Helper method for merge sort and inversion counting.
    *
    * @param arr   The input array.
    * @param temp  Temporary array to store the sorted elements during the merge
    *              process.
    * @param left  The left index of the subarray.
    * @param right The right index of the subarray.
    * @return The number of inversions in the subarray.
    */
   private static long mergeSort(long arr[], long temp[], int left, int right) {
      long count = 0;
      if (left < right) {
         int mid = (left + right) / 2;

         // Recursive calls to sort and count inversions in the two halves
         count += mergeSort(arr, temp, left, mid);
         count += mergeSort(arr, temp, mid + 1, right);

         // Merge the two sorted halves and count inversions
         count += merge(arr, temp, left, mid, right);
      }
      return count;
   }

   /**
    * Merge two halves of the array and count inversions.
    *
    * @param arr   The input array.
    * @param temp  Temporary array to store the sorted elements during the merge
    *              process.
    * @param left  The left index of the subarray.
    * @param mid   The middle index of the subarray.
    * @param right The right index of the subarray.
    * @return The number of inversions in the merged subarray.
    */
   private static long merge(long arr[], long temp[], int left, int mid, int right) {
      long count = 0;

      // Copy elements to temporary array
      System.arraycopy(arr, left, temp, left, right - left + 1);

      int i = left;
      int j = mid + 1;
      int k = left;

      // Merge and count inversions
      while (i <= mid && j <= right) {
         if (temp[i] <= temp[j]) {
            arr[k++] = temp[i++];
         } else {
            // If the element in the left half is greater than the element in the right
            // half,
            // it's an inversion, and we add the count of inversions.
            count += mid - i + 1;
            arr[k++] = temp[j++];
         }
      }

      // Copy remaining elements from the left subarray
      while (i <= mid) {
         arr[k++] = temp[i++];
      }

      // Copy remaining elements from the right subarray
      while (j <= right) {
         arr[k++] = temp[j++];
      }

      return count;
   }

   public static void main(String[] args) {
      // Example usage
      long[] arr = { 5, 3, 2, 4, 1 };
      long inversions = getInversions(arr);
      System.out.println("Number of inversions: " + inversions);
   }
}

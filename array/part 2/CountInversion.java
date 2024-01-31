public class CountInversion {
   public static void main(String[] args) {
      // Example usage
      long[] arr = { 5, 3, 2, 4, 1 };
      int length = arr.length;
      long inversions = getInversions(arr, length);
      System.out.println("Number of inversions: " + inversions);
   }

   public static long getInversions(long arr[], int n) {
      // Variable to store the count of inversions
      long count = 0;

      // Nested loops to compare each pair of elements in the array
      for (int i = 0; i < arr.length; i++) {
         for (int j = i; j < arr.length; j++) {
            // If the element at index i is greater than the element at index j, it's an
            // inversion
            if (arr[i] > arr[j]) {
               count++;
            }
         }
      }

      // Return the total count of inversions
      return count;
   }
}

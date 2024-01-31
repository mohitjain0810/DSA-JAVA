public class merge {

   public static void mergeSort(int arr[], int l, int r) {
      // Base case: If the left index is greater than or equal to the right index, the
      // array is already sorted
      if (l >= r)
         return;
      // take out the middle in the array
      int mid = (l + r) / 2;
      // Base case: If the left index is greater than or equal to the right index, the
      // array is already sorted
      mergeSort(arr, l, mid);
      mergeSort(arr, mid + 1, r);
      // merge the sorted halves
      merging(arr, l, mid, r);
   }

   // Method to merge two sorted halves of the array
   public static void merging(int arr[], int l, int mid, int r) {
      int n1 = mid - l + 1;
      int n2 = r - mid;

      // Create temporary arrays to hold the left and right halves
      int left[] = new int[n1];
      int right[] = new int[n2];

      // Copy data to temporary arrays
      // Copy elements from the original array to the leftArray
      for (int i = 0; i < n1; i++)
         left[i] = arr[l + i];
      // Copy elements from the original array to the rightArray
      for (int j = 0; j < n2; j++)
         right[j] = arr[mid + 1 + j];

      // Merge the two halves back into the original array
      int i = 0, j = 0, k = l;
      while (i < n1 && j < n2) {
         if (left[i] < right[j])
            arr[k++] = left[i++];
         else
            arr[k++] = right[j++];
      }
      // Copy the remaining elements of leftArray[], if any
      while (i < n1)
         arr[k++] = left[i++];
      // Copy the remaining elements of rightArray[], if any
      while (j < n2)
         arr[k++] = right[j++];

   }

   // Print the array
   public static void displayArray(int arr[]) {
      for (int val : arr) {
         System.out.print(val + " ");
      }
   }

   public static void main(String[] args) {
      int arr[] = { 4, 1, 3, 5, 2 };
      int n = arr.length;
      System.out.println("Array before sorting");
      displayArray(arr);

      mergeSort(arr, 0, n - 1);
      System.out.println();
      System.out.println("Array after sorting");
      displayArray(arr);
   }
}

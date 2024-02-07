public class quick {
   public static void main(String[] args) {
      int arr[] = { 6, 3, 1, 5, 4 };
      System.out.println("Array before sorting");
      displayArray(arr);
      System.out.println();
      quickSort(arr, 0, arr.length - 1);
      System.out.println("Array after sorting");
      displayArray(arr);
   }

   public static void displayArray(int arr[]) {
      for (int val : arr) {
         System.out.print(val + " ");
      }
   }

   public static void swap(int arr[], int x, int y) {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
   }

   public static void quickSort(int arr[], int start, int end) {
      // Base case: If the start index is greater than or equal to the end index, the
      // array is already sorted
      if (start >= end)
         return;

      // Partition the array and get the pivot index
      int pivotIndex = partition(arr, start, end);

      // Recursively sort the two sub-arrays on either side of the pivot
      quickSort(arr, start, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, end);
   }

   public static int partition(int arr[], int start, int end) {
      // Choose the pivot element (in this case, the element at the start index)
      int pivot = arr[start];

      // Count the number of elements less than or equal to the pivot
      int count = 0;
      for (int i = start + 1; i <= end; i++) {
         if (arr[i] <= pivot)
            count++;
      }

      // Calculate the pivot index based on the count
      int pivotIndex = start + count;

      // Swap the pivot element to its correct position
      swap(arr, start, pivotIndex);

      // Initialize pointers for traversing the array
      int i = start;
      int j = end;

      // Arrange elements such that those less than or equal to the pivot are on the
      // left, and those greater are on the right
      while (i < pivotIndex && j > pivotIndex) {
         while (arr[i] < pivot)
            i++;
         while (arr[j] > pivot)
            j--;

         // Swap elements if needed
         if (i < pivotIndex && j > pivotIndex) {
            swap(arr, i, j);
            i++;
            j--;
         }
      }

      // Return the final pivot index
      return pivotIndex;
   }
}

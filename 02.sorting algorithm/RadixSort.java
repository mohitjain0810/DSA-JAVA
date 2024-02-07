import java.util.*;

public class RadixSort {
   public static void main(String[] args) {
      int arr[] = {43, 453, 626, 894, 0, 3};
      raxixSorting(arr);
      displayArr(arr);
   }

   public static void displayArr(int arr[]) {
      for (int val : arr) {
         System.out.print(val + " ");
      }
      System.out.println();
   }

   public static int findMax(int arr[]) {
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      return max;
   }

   public static void countSorting(int arr[], int place) {
      // find the largest element of the array
      int max = findMax(arr);
      int n = arr.length;
      int output[] = new int[n];
      int count[] = new int[10];
      for (int i = 0; i < arr.length; i++) {
         count[arr[i] / place % 10]++;
      }
      // Make prefix sum array of count array
      for (int i = 0; i < count.length; i++) {
         count[i] += count[i - 1];
      }
      // Find the index of each element in the original array put it in output array
      for (int i = n - 1; i >= 0; i--) {
         int idx = count[arr[i] / place % 10] - 1;
         output[idx] = arr[i];
         count[arr[i] / place % 10]--;
      }
      // copy all element of output to arr
      for (int i = 0; i < n; i++) {
         arr[i] = output[i];
      }
   }

   public static void raxixSorting(int arr[]) {
      int max = findMax(arr);

      //// apply counting sort to sort element on place value
      for (int place = 1; max / place > 0; place *= 10) {
         countSorting(arr, place);
      }
   }
}

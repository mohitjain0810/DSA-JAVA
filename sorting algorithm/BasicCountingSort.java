import java.util.*;

public class BasicCountingSort {
   public static void main(String[] args) {
      int arr[] = { 1, 1, 4, 5, 2, 2, 5 };
      countSorting(arr);
      displayArr(arr);
   }

   public static void displayArr(int arr[]) {
      for (int val : arr) {
         System.out.print(val + " ");
      }
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

   public static void countSorting(int arr[]) {
      // find the largest element of the array
      int max = findMax(arr);
      int count[] = new int[max + 1];
      for (int i = 0; i < arr.length; i++) {
         count[arr[i]]++;
      }
      int k = 0;
      for (int i = 0; i < count.length; i++) {
         for (int j = 0; j < count[i]; j++) {
            arr[k++] = i;
         }
      }
   }
}
